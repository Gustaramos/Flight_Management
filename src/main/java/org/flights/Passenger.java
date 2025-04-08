package org.flights;

public class Passenger {
    private String name;
    private String cpf;
    private String phoneNumber;
    //Flight currentFlight;

    public Passenger() {
        this.name = "";
        this.cpf = "";
        this.phoneNumber = "";
        //Flight curreFlight = new Flight();
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

   // public Flight getCurrentFlight() {
     //   return this.currentFlight;
    //}



}
