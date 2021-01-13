package cn.edu.hcnu.dao.impl;

import cn.edu.hcnu.dao.IFlieghtDao;
import cn.edu.hcnu.dto.Flight;
import cn.edu.hcnu.tools.JDBConnection;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FligthDaoImp implements IFlieghtDao {
    Connection  con;
    PreparedStatement ps;
    @Override
    public void insertFlight(Flight fligth) throws SQLException {
        con = JDBConnection.getConnection();
        System.out.println(con);
        String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        ps = con.prepareStatement(sql);
        ps.setString(1,fligth.getId());
        ps.setString(2,fligth.getFlightId());
        ps.setString(3,fligth.getPlanType());
        ps.setInt(4,fligth.getCurrentSeatsNum());
        ps.setString(5,fligth.getDepartureAirport());
        ps.setString(6,fligth.getDestinationAirport());
        ps.setString(7,fligth.getDepartureTime());

        ps.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFligths() throws SQLException {
        Set <Flight> flights =new HashSet<Flight>();
        con = JDBConnection.getConnection();
        String sql ="SELECT * FROM flight";

        ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            String id= rs.getString("ID");
            String flightId = rs.getString("FLIGHT_ID");
            String planeType = rs.getString("PLANE_TYPE");
            int currentSeatsNum = rs.getInt("TOTAL_SEATS_NUM");
            String departureAirport = rs.getString("DEPARTURE_AIRPORT");
            String destinationAirport = rs.getString("DESTINATION_AIRPORT");
            String departureTime = rs.getString("DEPARTURE_TIME");

            Flight flight = new Flight(id, flightId, departureAirport, destinationAirport, departureTime, planeType, currentSeatsNum);
            flights.add(flight);
        }
        return flights;
    }

    @Override
    public Flight getFligthByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFligthByDepartureAirport(String DepartureAirport) {
        return null;
    }

    @Override
    public Flight getFligthByDestinationAirPort(String DestinationAirPort) {
        return null;
    }
}
