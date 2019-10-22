package com.example.midtermpractice.models;

import java.util.ArrayList;

public class Person {

    //1.) Define Attributes of the class
    protected String mFirstName;
    protected String mLastname;
    protected ArrayList<Vehicle> mVehicles;

    //2.) Create Constructor for Class
    public Person (String fName, String lName){
        mFirstName = fName;
        mLastname = lName;
    }

    //3.) Generate Getters and Setters for Attributes.

    public String getFirstName() {
        return mFirstName + " ";
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String lastname) {
        mLastname = lastname;
    }

    public ArrayList<Vehicle> getVehicles() {
        return mVehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        mVehicles = vehicles;
    }
}
