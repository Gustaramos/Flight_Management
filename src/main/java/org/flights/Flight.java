package org.flights;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departure;
    private int totalSeatsOnFlight;
    private int availableSeats;
    private static ArrayList<Flight> listOfFlights = new ArrayList<Flight>();

    public Flight() {
        this.flightNumber = 0;
        this.origin = "";
        this.destination = "";
        this.departure = "";
        this.totalSeatsOnFlight = 0;

    }

    public Flight(int flightNumber, String origin, String destination, String departure, int totalSeatsOnFlight) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.totalSeatsOnFlight = totalSeatsOnFlight;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDeparture() {
        return this.departure;
    }

    public int getTotalSeatsOnFlight() {
        return this.totalSeatsOnFlight;
    }

    public int getAvaiableSeats() {
        return this.availableSeats;
    }

    public void FlightsInfos(int numberOfFlight) {
	System.out.println("Flight of number: " + getFlightNumber());
	System.out.println("Origin: "+ getOrigin());
	System.out.println("Destiny: " + getDestination());
        System.out.println("Departure: " + getDeparture());
        System.out.println("Total seats on Airplane: " + getTotalSeatsOnFlight());
        System.out.println("Seats avaiable: " + getAvaiableSeats());
    }

    public void ListAllFlights() {
	for(Flight flight : listOfFlights) {
		System.out.println("Alright! Here are the flights registered by now: " + this.flightNumber);
  	}
    }

    public static void CreateNewFlight(Flight newFlight){
        listOfFlights.add(newFlight);
    }
}

