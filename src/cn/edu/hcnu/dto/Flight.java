package cn.edu.hcnu.dto;

public class Flight {
    private  String id;
    private String flightId; //航班号
    private String departureAirport; //出发机场
    private String destinationAirport; //到达机场
    private String departureTime;   //
    private String destinationTime;
    private String planType; //飞机机型

    private int currentSeatsNum; //座位数

    public Flight(String id, String flightId, String departureAirport, String destinationAirport, String departureTime, String planType, int currentSeatsNum) {
        this.id = id;
        this.flightId = flightId;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.destinationTime = destinationTime;
        this.planType = planType;
        this.currentSeatsNum = currentSeatsNum;
    }

    public Flight() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(String destinationTime) {
        this.destinationTime = destinationTime;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", flightId='" + flightId + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", destinationTime='" + destinationTime + '\'' +
                ", planType='" + planType + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                '}';
    }
}
