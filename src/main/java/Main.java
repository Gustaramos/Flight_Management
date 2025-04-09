package org.app;
import org.flights.Flight;
import org.flights.Passenger;

import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
	Scanner inputUser = new Scanner(System.in);
	System.out.println("Please, enter the flight information!");

        System.out.println("Destiny of the flight: ");
        String flightDestiny = inputUser.nextLine();

        System.out.println("Origin of the flight: ");
        String flightOrigin = inputUser.nextLine();

        System.out.println("Date and time of flight departure (Ex: 25/11/2020 12:00): ");
        String flightDapartureDateTime = inputUser.nextLine();

        System.out.println("Number of the flight: ");
        int flightNumber = inputUser.nextInt();

        System.out.println("Total of seats on Airplane: ");
        int flightSeats = inputUser.nextInt();

	// flightNumber, origin, destination,  departure,  totalSeatsOnFlight.
	Flight newFlightDestiny = new Flight(flightNumber, flightOrigin, flightDestiny, flightDapartureDateTime, flightSeats);

	int searchFlightByNumber = inputUser.nextInt();
        newFlightDestiny.FlightsInfos(searchFlightByNumber);

	Flight.CreateNewFlight(newFlightDestiny);
	newFlightDestiny.ListAllFlights();
   }

}
