package org.flights;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Handler;

public class Passenger {
    private String name;
    private String cpf;
    private String phoneNumber;
    Flight flights = new Flight();


    public Passenger() {
        this.name = "";
        this.cpf = "";
        this.phoneNumber = "";

    }
    //Flight currentFlight
    public Passenger(String name, String cpf, String phoneNumber) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void SeatBooking(String flightDestiny) throws InterruptedException {
        Scanner inputUser = new Scanner(System.in);
        for (Flight flight : flights.getListOfFlights()) {
            if (!flights.getListOfFlights().contains(flight)) {
                System.out.println("Opss... Flight cannot be found!");
                break;
            }
            long start = System.currentTimeMillis();
            System.out.println("Searching flight...");
            Thread.sleep(2000);

            System.out.println("Nice! We have an flight to: " + flightDestiny);
            System.out.println("Do you want to reserve your ticket?");
            String buyTickets = inputUser.nextLine();
            if (!buyTickets.equalsIgnoreCase("yes")) {
                System.out.println("Ok! See you later.");
                break;
            }
            System.out.println("Alright! How many tickets do you want to buy?");
            int numberOfSeatsToBook = inputUser.nextInt();
            inputUser.nextLine();
            flight.flightSeatsBooking(numberOfSeatsToBook);
            System.out.println("Congratulation! Your flight has been booked successfully!");

        }
    }

}