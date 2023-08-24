package com.kmmania;

public class Athlete {
    private final String speciality;

    public Athlete(String speciality) {
        this.speciality = speciality;
    }

    public String mySpeciality() {
        return "my speciality is " + speciality;
    }

}
