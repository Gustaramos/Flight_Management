package org.flights;

import java.util.Objects;
import java.util.Scanner;

public class Passenger {
    private String name;
    private String cpf;
    private String phoneNumber;
    private Flight flights = new Flight();

    public Passenger() {
        this.name = "";
        this.cpf = "";
        this.phoneNumber = "";
    }

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

    public void seatBooking() throws InterruptedException {
        Flight flight = new Flight();
        try (Scanner inputUser = new Scanner(System.in)) {
            System.out.println("Alright! How many tickets do you want to buy?");
            int numberOfSeatsToBook = inputUser.nextInt();
            inputUser.nextLine();
            flight.flightSeatsBooking(numberOfSeatsToBook);
        }
        System.out.println("Congratulation! Your flight has been booked successfully!");

    }

    //Encapsulating method for verify if a flight exists in the list.
    public void verifyIfFlightExist(String flightDestiny) throws InterruptedException {
        boolean found = false;

        for (Flight flight : flights.getListOfFlights()) {
            if (Objects.equals(flight.getDestination(), flightDestiny)) {
                found = true;
                System.out.println("Searching flight...");
                Thread.sleep(2000);
                System.out.println("Nice! We have an flight to: " + flightDestiny);

            }
        }
        if (!found) {
            System.out.println("We don't have any flight to " + flightDestiny);
        }
    }
}
