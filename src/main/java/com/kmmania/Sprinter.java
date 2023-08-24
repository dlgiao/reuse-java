package com.kmmania;

public class Sprinter extends Athlete {

    private final String firstName;
    private final String lastName;

    public Sprinter(String firstName, String lastName, String speciality) {
        super(speciality);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void display() {
        System.out.println("My name is " + this.firstName + " " + this.lastName + ", " + super.mySpeciality());
    }
}
