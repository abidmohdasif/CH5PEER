import java.util.*;

class Flight {
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    public Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    public GregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(GregorianCalendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getFlightTime() {
        long diffInMillis = arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis();
        return (int) (diffInMillis / (1000 * 60)); // Convert milliseconds to minutes
    }
}

class Itinerary {
    private List<Flight> flights;

    public Itinerary(List<Flight> flights) {
        this.flights = flights;
    }

    public int getTotalTravelTime() {
        if (flights.isEmpty()) {
            return 0;
        }
        GregorianCalendar firstDeparture = flights.get(0).getDepartureTime();
        GregorianCalendar lastArrival = flights.get(flights.size() - 1).getArrivalTime();
        long diffInMillis = lastArrival.getTimeInMillis() - firstDeparture.getTimeInMillis();
        return (int) (diffInMillis / (1000 * 60)); // Convert milliseconds to minutes
    }

    public int getTotalFlightTime() {
        int totalFlightTime = 0;
        for (Flight flight : flights) {
            totalFlightTime += flight.getFlightTime();
        }
        return totalFlightTime;
    }
}

public class CH11Inher {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("US230",
                new GregorianCalendar(2014, 4, 5, 5, 5, 0),
                new GregorianCalendar(2014, 4, 5, 6, 15, 0)));

        flights.add(new Flight("US235",
                new GregorianCalendar(2014, 4, 5, 6, 55, 0),
                new GregorianCalendar(2014, 4, 5, 7, 45, 0)));

        flights.add(new Flight("US237",
                new GregorianCalendar(2014, 4, 5, 9, 35, 0),
                new GregorianCalendar(2014, 4, 5, 12, 55, 0)));

        Itinerary itinerary = new Itinerary(flights);

        System.out.println(itinerary.getTotalTravelTime());
        System.out.println(itinerary.getTotalFlightTime());
    }
}