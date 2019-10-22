package com.example.midtermpractice.models;

import java.util.ArrayList;

public class PersonDB {

    private static final PersonDB ourInstance = new PersonDB();
    private ArrayList<Person> mPersonList;

    public static PersonDB getOurInstance() {
        return ourInstance;
    }

    private PersonDB(){

    }

    public ArrayList<Person> getPersonList() {
        return mPersonList;
    }
    public void setPersonList(ArrayList<Person> personList) {
        mPersonList = personList;
    }

        //Pre-define Some information into the DB.
    public void createPersonObject(){
        Person person = new Person("Sami", "Halwani");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("ABC1234EFG567", "Mercedes", "C250"));
        person.setVehicles(vehicles);
        mPersonList = new ArrayList<Person>();
        mPersonList.add(person);

        person = new Person("Jeremy", "Colvin");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("987ZYX765WVU", "Toyota", "Tocoma"));
        person.setVehicles(vehicles);
        mPersonList = new ArrayList<Person>();
        mPersonList.add(person);

        person = new Person("James", "Hayer");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("456EFG123ABC", "Chevy", "Colorado"));
        person.setVehicles(vehicles);
        mPersonList = new ArrayList<Person>();
        mPersonList.add(person);


    }

}
