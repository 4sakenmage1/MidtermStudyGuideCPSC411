package com.cpsc411.personsapplication.model;

public class Vehicle {
    protected String mVIN;
    protected String mMake;
    protected  String mModel;

    public Vehicle(String VIN, String Make, String Model) {
        mVIN = VIN;
        mMake = Make;
        mModel = Model;
    }

    public String getVIN() {
        return mVIN;
    }

    public void setVIN(String VIN) {
        mVIN = VIN;
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
