package org.app;
import org.flights.Flight;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        CreateNewFlight();

    }

    public static Flight CreateNewFlight(){
        // flightNumber, origin, destination,  departure,  totalSeatsOnFlight
        System.out.println("Please, enter the flight information: ");
        Flight newFlightDestiny = new Flight();

        return newFlightDestiny;
    }

}