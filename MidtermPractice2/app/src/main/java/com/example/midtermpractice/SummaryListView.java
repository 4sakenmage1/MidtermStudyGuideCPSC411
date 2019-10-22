package com.example.midtermpractice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.midtermpractice.adapter.SummaryListAdapter;
import com.example.midtermpractice.models.Person;
import com.example.midtermpractice.models.PersonDB;
import com.example.midtermpractice.models.Vehicle;

import java.util.ArrayList;

public class SummaryListView extends Activity {

    ListView mSummaryView;
    PersonDB mPersonDB;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.person_list_lv);

        createPersonObject();

        mSummaryView = findViewById(R.id.summary_list_id);
        SummaryListAdapter ad = new SummaryListAdapter();
        mSummaryView.setAdapter(ad);
    }

    protected void createPersonObject(){
        Person person = new Person("Sami", "Halwani");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("ABC1234EFG567", "Mercedes", "C250"));
        person.setVehicles(vehicles);
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person);

        person = new Person("Jeremy", "Colvin");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("987ZYX765WVU", "Toyota", "Tocoma"));
        person.setVehicles(vehicles);
        persons.add(person);

        person = new Person("James", "Hayer");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("456EFG123ABC", "Chevy", "Colorado"));
        person.setVehicles(vehicles);
        persons.add(person);

        PersonDB.getOurInstance().setPersonList(persons);
    }

}
