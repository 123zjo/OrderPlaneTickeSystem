package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dto.Flight;

import java.util.Scanner;
import java.util.Set;

public class FlightServiceImp implements IFlightService {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println(flight);
    }

    @Override
    public Set<Flight> getALLFlights() {
        return null;
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
