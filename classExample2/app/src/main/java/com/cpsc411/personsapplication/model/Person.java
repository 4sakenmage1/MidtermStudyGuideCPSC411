package com.cpsc411.personsapplication.model;

import java.util.ArrayList;

public class Person {
    protected String mFirstName; // naming convention member items starts with a lowercae m
    protected  String mLastName;

    protected ArrayList<Vehicle> mVehicles;

    public Person(String fName, String lName){ //This is a constructor for this class
        mFirstName = fName;
        mLastName = lName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public ArrayList<Vehicle> getVehicles() {
        return mVehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        mVehicles = vehicles;
    }
}
