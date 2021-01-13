package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.IFlieghtDao;
import cn.edu.hcnu.dao.impl.FligthDaoImp;
import cn.edu.hcnu.dto.Flight;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

public class FlightServiceImp implements IFlightService {
     IFlieghtDao flieghtDao;

    public FlightServiceImp() {
        this.flieghtDao = new FligthDaoImp();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        System.out.println("BLL接收到的航班信息："+flight);
        flieghtDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getALLFlights() throws SQLException {
        return flieghtDao.getAllFligths();
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
