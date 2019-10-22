package com.cpsc411.personsapplication.model;

import java.util.ArrayList;

public class PersonDB {
    private static final PersonDB ourInstance = new PersonDB();

    private ArrayList<Person> mPersonList;
    static public PersonDB getInstance() {
        return ourInstance;
    }

    private PersonDB() {
    }

    public ArrayList<Person> getPersonList() {
        return mPersonList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        mPersonList = personList;
    }

    protected void createPersonObjects() {
        Person person = new Person("Sami", "Halwani");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("JSDFE#", "Mercedes", "C250"));
        //vehicles.add(new Vehicle("RDE323", "BMW", "M3"));
        person.setVehicles(vehicles);
        mPersonList = new ArrayList<Person>();
        mPersonList.add(person);

        person = new Person("John", "Doe");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("JGE32Dj", "Subaru", "WRX STI"));
        person.setVehicles(vehicles);
        mPersonList = new ArrayList<Person>();
        mPersonList.add(person);
    }







}
