package baitap.baitap611;

public class FlightInformation {

    private String flightCode;

    private Long flightDate;

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

    public Long getFlightDate() {
        return flightDate;
    }

    public FlightInformation(String flightCode, Long flightDate, Long flightTime, String departure, String destination) {
        this.flightCode = flightCode;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.departure = departure;
        this.destination = destination;
    }

    public void setFlightDate(Long flightDate) {
        this.flightDate = flightDate;
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
