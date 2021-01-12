package cn.edu.hcnu.ui;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.impl.FlightServiceImp;
import cn.edu.hcnu.dto.Flight;

import java.util.Scanner;

import java.util.UUID;

public class MainUI {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("请输入相应的数字进行操作：");
            System.out.println("按1：录入航班信息");
            System.out.println("按2：显示所有航班信息");
            System.out.println("按3：查询航班信息");
            System.out.println("按4：机票预订");
            System.out.println("按5：机票退订");
            System.out.println("按6：退出系统");

            int action = sc.nextInt();
            switch (action){
                case 1:{
                    String id = UUID.randomUUID().toString();
                    System.out.println("id=" + id);

                    System.out.println("请输入航班编号");
                    String flightId = sc.next();
                    System.out.println("请输入机型：");
                    String planeType = sc.next();
                    System.out.println("请输入座位数：");
                    int currentSeatsNum =sc.nextInt();
                    System.out.println("请输入起飞机场:");
                    String departureAirport = sc.next();
                    System.out.println("请输入目的机场:");
                    String destinationAirport =sc.next();
                    System.out.println("请输入起飞时间：");
                    String departureTime =sc.next();

                    Flight flight = new Flight(id,flightId,departureAirport,destinationAirport,departureTime,planeType,currentSeatsNum);

                    IFlightService flightService = new FlightServiceImp();

                    flightService.insertFlight(flight);
                /*
                    private  String id;
                    private String flightId; //航班号
                    private String departureAirport; //出发机场
                    private String destinationAirport; //到达机场
                    private String departureTime;   //
                    private String destinationTime;
                    private String planType; //飞机机型

                    private int currentSeatsNum; //座位数*/
                }  break;

                case 2: break;
                case 3: break;
            }
        }
    }
}
