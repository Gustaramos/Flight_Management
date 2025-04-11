package org.flights;

import java.util.ArrayList;

public class Flight{
    private int flightNumber;
    private String origin;
    private String destination;
    private String departure;
    private int totalSeatsOnFlight;
    private int availableSeats;
    private static ArrayList<Flight> listOfFlights = new ArrayList<Flight>();


    public Flight(){
        this.flightNumber = 0;
        this.origin = "";
        this.destination = "";
        this.departure = "";
        this.totalSeatsOnFlight = 0;
    }

    public Flight(int flightNumber, String origin, String destination, String departure, int totalSeatsOnFlight){
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.totalSeatsOnFlight = totalSeatsOnFlight;
        this.availableSeats = totalSeatsOnFlight;
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

    public String getDeparture(){
        return this.departure;
    }

    public int getTotalSeatsOnFlight() {
        return this.totalSeatsOnFlight;
    }

    public int getAvailableSeats(){
        return this.availableSeats;
    }

    public static void flightsInfos(int numberOfFlight){
        for (Flight flight : listOfFlights) {
            if (flight.getFlightNumber() == numberOfFlight) {
                System.out.println("Flight of number: " + flight.getFlightNumber());
                System.out.println("Origin: "+ flight.getOrigin());
                System.out.println("Destiny: " + flight.getDestination());
                System.out.println("Departure: " + flight.getDeparture());
                System.out.println("Total seats on Airplane: " + flight.getTotalSeatsOnFlight());
                System.out.println("Seats available: " + flight.getAvailableSeats());
                System.out.println("----------------------------------------------");
                break;
            } else {
                System.out.println("We have any flight with this number!");
            }
        }
    }

    public ArrayList<Flight> getListOfFlights(){
        return listOfFlights;
    }

    public static void showFlightsRegistered () {
        System.out.println("Here are all your registered flights!");
        for (Flight flight : listOfFlights) {
            System.out.println("Flight number: " + flight.getFlightNumber()
                    + "\nFlight destination: " + flight.getDestination() +
                    "\nFlight origin: " + flight.getOrigin() +
                    "\nFlight departure: " + flight.getDeparture() + "\n");
        }
    }

    public static void createNewFlight(Flight newFlight){
        listOfFlights.add(newFlight);
    }

    public void flightSeatsBooking(int numberOfSeatsBooked){
        if (getAvailableSeats() >= numberOfSeatsBooked) {
            if (getAvailableSeats() < numberOfSeatsBooked) {
                System.out.println("Oh sorry! We don't have this amount of tickets available!");
            }
            this.availableSeats = availableSeats - numberOfSeatsBooked;
        }
    }
}

