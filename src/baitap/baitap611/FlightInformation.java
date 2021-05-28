package baitap.baitap611;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightInformation {

    private String flightCode;

    private Date flightDate;

    private Long flightTime;

    private String departure;

    private String destination;

    public FlightInformation() {
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public Long getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Long flightTime) {
        this.flightTime = flightTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "FlightInformation{" +
                "flightCode='" + flightCode + '\'' +
                ", flightDate=" + flightDate +
                ", flightTime=" + flightTime +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
