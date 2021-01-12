package cn.edu.hcnu.bll;

import cn.edu.hcnu.dto.Flight;

import java.util.Set;

public interface IFlightService {
    void  insertFlight(Flight flight);
    Set<Flight> getALLFlights();
    Flight getFligthByDepartureTime(String departureTime);
    Flight getFligthByDepartureAirport(String DepartureAirport);
    Flight getFligthByDestinationAirPort(String DestinationAirPort);

}
