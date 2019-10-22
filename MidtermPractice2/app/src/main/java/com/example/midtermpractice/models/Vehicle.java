package com.example.midtermpractice.models;

public class Vehicle {

    //1.) Define attributes of the class
    protected String mVin;
    protected String mMake;
    protected String mModel;

    // 2.) Create Constructor for class
    public Vehicle(String VIN, String Make, String Model){
        mVin = VIN;
        mMake = Make;
        mModel = Model;
    }

    public String getVin() {
        return mVin;
    }

    public void setVin(String vin) {
        mVin = vin;
    }

    public String getMake() {
        return mMake;
    }

    public void setMake(String make) {
        mMake = make;
    }

    public String getModel() {
        return mModel;
    }

    public void setModel(String model) {
        mModel = model;
    }
}
