package cn.edu.hcnu.dao;

import cn.edu.hcnu.dto.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlieghtDao {
    void insertFlight(Flight fligth) throws SQLException;
    Set<Flight> getAllFligths() throws SQLException;
    Flight getFligthByDepartureTime(String departureTime);
    Flight getFligthByDepartureAirport(String DepartureAirport);
    Flight getFligthByDestinationAirPort(String DestinationAirPort);

}
