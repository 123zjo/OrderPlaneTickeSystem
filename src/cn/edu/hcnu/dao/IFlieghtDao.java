package cn.edu.hcnu.dao;

import cn.edu.hcnu.dto.Flight;

import java.util.Set;

public interface IFlieghtDao {
    void insertFlight(Flight fligth);
    Set<Flight> getAllFligths();
    Flight getFligthByDepartureTime(String departureTime);
    Flight getFligthByDepartureAirport(String DepartureAirport);
    Flight getFligthByDestinationAirPort(String DestinationAirPort);

}
