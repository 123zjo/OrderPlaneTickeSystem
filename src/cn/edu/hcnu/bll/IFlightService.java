package cn.edu.hcnu.bll;

import cn.edu.hcnu.dto.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void  insertFlight(Flight flight) throws SQLException;
    Set<Flight> getALLFlights() throws SQLException;
    Flight getFligthByDepartureTime(String departureTime);
    Flight getFligthByDepartureAirport(String DepartureAirport);
    Flight getFligthByDestinationAirPort(String DestinationAirPort);

}
