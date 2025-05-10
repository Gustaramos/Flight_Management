import org.flights.Flight;
import org.flights.Passenger;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner inputUser = new Scanner(System.in)) {
            System.out.println("Welcome to Easy Flight Search System! " +
                    "Please tell us your role in our system: ");
            System.out.println("1 - I am a customer!");
            System.out.println("2 - I am a management employee");
            String userRole =  inputUser.nextLine();
            if (userRole.contains("1") || userRole.contains("1 - I am a customer!") ||
                    userRole.contains("I am a customer")) {
                System.out.println();
                Passenger newPassenger = new Passenger();
                System.out.println();
                System.out.print("Please, Infsorms your destination: ");
                String passengerDestination = inputUser.nextLine();
                newPassenger.verifyIfFlightExist(passengerDestination);
                newPassenger.seatBooking();
                inputUser.nextLine();
            }
            if (userRole.contains("2") || userRole.contains("2 - I am a management employee") ||
                    userRole.contains("I am a management employee")) {
                System.out.println("Welcome to Easy Flight Management System!");
                System.out.println("Please, fill in the information below to register a new flight!" +
                        "How many flights will be registered? Please enter the total of flights: ");

                int totalFlightsToRegister = inputUser.nextInt();
                inputUser.nextLine();
                while (totalFlightsToRegister > 0) {
                    airlineEmployerManagement();
                    --totalFlightsToRegister;
                }
                System.out.println("Would you like to see the flight information? ");
                String userAnswer = inputUser.nextLine();
                if (userAnswer.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter the flight number: ");
                    int searchFlightNumber = inputUser.nextInt();
                    inputUser.nextLine();
                    Flight.flightsInfos(searchFlightNumber);
                }
                System.out.println("Do you like to see all flights you have registered?");
                String seeFlightsRegistered = inputUser.nextLine();
                if (seeFlightsRegistered.equalsIgnoreCase("yes")) {
                    Flight.showFlightsRegistered();
                }
            }





            //após teste excluir linhas até linha 98
            System.out.println("1 - I am a customer!");
            System.out.println("2 - I am a management employee");
            userRole =  inputUser.nextLine();
            if (userRole.contains("1") || userRole.contains("1 - I am a customer!") ||
                    userRole.contains("I am a management employee")) {
                System.out.println();
                Passenger newPassenger = new Passenger();
                System.out.println();
                System.out.print("Please, Inform your destination: ");
                String passengerDestination = inputUser.nextLine();
                newPassenger.verifyIfFlightExist(passengerDestination);
                newPassenger.seatBooking();
                inputUser.nextLine();
            }


            if (userRole.contains("2") || userRole.contains("2 - I am a management employee") ||
                    userRole.contains("I am a management employee")) {

                System.out.println("Do you like to see all flights you have registered?");
                String seeFlightsRegistered = inputUser.nextLine();
                if (seeFlightsRegistered.equalsIgnoreCase("yes")) {
                    Flight.showFlightsRegistered();
                }

                System.out.println("Welcome to Easy Flight Management System!");
                System.out.println("Please, fill in the information below to register a new flight!" +
                        "How many flights will be registered? Please enter the total of flights: ");

                int totalFlightsToRegister = inputUser.nextInt();
                inputUser.nextLine();
                while (totalFlightsToRegister > 0) {
                    airlineEmployerManagement();
                    --totalFlightsToRegister;
                }
                System.out.println("Would you like to see the flight information? ");
                String userAnswer = inputUser.nextLine();
                if (userAnswer.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter the flight number: ");
                    int searchFlightNumber = inputUser.nextInt();
                    inputUser.nextLine();
                    Flight.flightsInfos(searchFlightNumber);
                }
                System.out.println("Do you like to see all flights you have registered?");
                seeFlightsRegistered = inputUser.nextLine();
                if (seeFlightsRegistered.equalsIgnoreCase("yes")) {
                    Flight.showFlightsRegistered();
                }
            }
        }



    }

    public static void airlineEmployerManagement () throws InterruptedException {
        try (Scanner inputUser = new Scanner(System.in)) {
            System.out.println("Destiny of the flight: ");
            String flightDestiny = inputUser.nextLine();

            System.out.println("Origin of the flight: ");
            String flightOrigin = inputUser.nextLine();

            System.out.println("Date and time of flight departure (Ex: 25/11/2020 - 12:00): ");
            String flightDepartureDateTime = inputUser.nextLine();

            System.out.println("Number of the flight: ");
            int flightNumber = inputUser.nextInt();

            System.out.println("Total of seats on Airplane: ");
            int flightSeats = inputUser.nextInt();
            inputUser.nextLine();

            // flightNumber, origin, destination, departure, totalSeatsOnFlight.
            Flight newFlightDestiny = new Flight(
                    flightNumber,
                    flightOrigin,
                    flightDestiny,
                    flightDepartureDateTime,
                    flightSeats);
            Flight.createNewFlight(newFlightDestiny);
        }

        System.out.println("recording the flight in our system, one second...");
        Thread.sleep(2000);
        System.out.println("Flight successfully registered!");
    }
}
