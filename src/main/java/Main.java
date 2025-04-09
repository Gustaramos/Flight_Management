import org.flights.Flight;
import org.flights.Passenger;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Welcome to Easy Flight Search System! " +
                "Please tell us your role in our system: ");
        System.out.println("1 - I am a customer!");
        System.out.println("2 - I am a management employee");
        String userRole =  inputUser.nextLine();
        if (userRole.contains("1") || userRole.contains("1 - I am a customer!") || userRole.contains("I am a management employee")) {
            System.out.println();
        }
        if (userRole.contains("2") || userRole.contains("2 - I am a management employee") || userRole.contains("I am a management employee")) {

            airlineManagement();
        }
        System.out.println();
        Passenger newPassenger = new Passenger();

        System.out.print("Please, Inform your destination: ");
        String passengerDestination = inputUser.nextLine();
        newPassenger.SeatBooking(passengerDestination);
        inputUser.nextLine();
    }

    public static void airlineManagement () throws InterruptedException {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Welcome to Easy Flight Management System!");
        System.out.println("Please, fill in the information below to register a new flight!" +
                "How many flights will be registered? Please enter the total of flights: ");
        int totalFlightsToRegister = inputUser.nextInt();



        System.out.println("Destiny of the flight: ");
        String flightDestiny = inputUser.nextLine();

        System.out.println("Origin of the flight: ");
        String flightOrigin = inputUser.nextLine();

        System.out.println("Date and time of flight departure (Ex: 25/11/2020 - 12:00): ");
        String flightDapartureDateTime = inputUser.nextLine();

        System.out.println("Number of the flight: ");
        int flightNumber = inputUser.nextInt();

        System.out.println("Total of seats on Airplane: ");
        int flightSeats = inputUser.nextInt();
        inputUser.nextLine();

        // flightNumber, origin, destination,  departure,  totalSeatsOnFlight.
        Flight newFlightDestiny = new Flight(flightNumber, flightOrigin, flightDestiny, flightDapartureDateTime, flightSeats);
        Flight.createNewFlight(newFlightDestiny);
        long start = System.currentTimeMillis();
        System.out.println("recording the flight in our system, one second...");
        Thread.sleep(2000);
        System.out.println("Flight successfully registered!");

        System.out.println("Would you like to see the flights information? ");
        String userAnswer = inputUser.nextLine();

        if (userAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the flight number: ");
            int searchFlightNumber = inputUser.nextInt();
            inputUser.nextLine();
            newFlightDestiny.flightsInfos(searchFlightNumber);
        }

    }

}
