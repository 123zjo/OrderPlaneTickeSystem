package cn.edu.hcnu.ui;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.impl.FlightServiceImp;
import cn.edu.hcnu.dto.Flight;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;

import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IFlightService flightService = new FlightServiceImp();
        while (true) {
            System.out.println("请输入相应的数字进行操作：");
            System.out.println("按1：录入航班信息");
            System.out.println("按2：显示所有航班信息");
            System.out.println("按3：查询航班信息");
            System.out.println("按4：机票预订");
            System.out.println("按5：机票退订");
            System.out.println("按6：退出系统");

            int action = sc.nextInt();
            switch (action) {
                case 1: {
                    String id = UUID.randomUUID().toString();
                    id = id.replace("-", "");
                    System.out.println("id=" + id);

                    System.out.println("请输入航班编号");
                    String flightId = sc.next();
                    System.out.println("请输入机型：");
                    String planeType = sc.next();
                    System.out.println("请输入座位数：");
                    int currentSeatsNum = sc.nextInt();
                    System.out.println("请输入起飞机场:");
                    String departureAirport = sc.next();
                    System.out.println("请输入目的机场:");
                    String destinationAirport = sc.next();
                    System.out.println("请输入起飞时间：");
                    String departureTime = sc.next();

                    Flight flight = new Flight(id, flightId, departureAirport, destinationAirport, departureTime, planeType, currentSeatsNum);



                    try {
                        flightService.insertFlight(flight);
                    } catch (SQLException e) {
                        String errorMessage = e.getMessage();
                        if (errorMessage.startsWith("ORA-12899")) {
                            //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                            // 按指定模式在字符串查找
                            String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                            // 创建 Pattern 对象
                            Pattern r = Pattern.compile(pattern);
                            // 现在创建 matcher 对象
                            Matcher m = r.matcher(errorMessage);
                            if (m.find()) {
                                String tableName = m.group(4);
                                String columnName = m.group(5);
                                System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                            } else {
                                System.out.println("NO MATCH");
                            }

                        }

                    }
                }
                break;

                case 2:{
                    try {
                        Set <Flight> flights =flightService.getALLFlights();
                        for (Flight flight: flights){
                            System.out.println(flight);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }

                    break;
                case 3:
                    break;
            }
        }
    }
}
