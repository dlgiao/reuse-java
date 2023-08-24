package com.kmmania;

public class DistanceRunner {
    private final String firstName;
    private final String lastName;
    private final AthleteInterface athlete;

    public DistanceRunner(String firstName, String lastName, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.athlete = new AthleteImpl(speciality);
    }

    public void display() {
        System.out.println("My name is " + this.firstName + " " + this.lastName + ", " + athlete.mySpeciality());
    }
}
