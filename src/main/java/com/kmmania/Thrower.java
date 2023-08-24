package com.kmmania;

public class Thrower {
    private final String firstName;
    private final String lastName;
    private final Athlete athlete;

    public Thrower(String firstName, String lastName, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.athlete = new Athlete(speciality);
    }

    public void display() {
        System.out.println("My name is " + this.firstName + " " + this.lastName + ", " + athlete.mySpeciality());
    }
}
