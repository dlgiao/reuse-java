package com.kmmania;

public class AthleteImpl implements AthleteInterface {
    private final String speciality;

    public AthleteImpl(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String mySpeciality() {
        return "my speciality is " + this.speciality;
    }
}
