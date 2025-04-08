package org.flights;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    LocalDateTime departure;
    private int totalSeatsOnFlight = 50;
    int[] AvailableSeats;

    public Flight() {
        this.flightNumber = 0;
        this.origin = "";
        this.destination = "";
        //LocalDateTime departure = LocalDateTime.parse("");
        this.totalSeatsOnFlight = 0;
    }

    public Flight(int flightNumber, String origin, String destination, String departure, int totalSeatsOnFlight) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        //this.departure = LocalDateTime.parse(departure);
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

    public LocalDateTime getDeparture() {
        return this.departure;
    }

    public int getTotalSeatsOnFlight() {
        return this.totalSeatsOnFlight;
    }

    public int[] getAvailableSeats() {
        return this.AvailableSeats;
    }



}
