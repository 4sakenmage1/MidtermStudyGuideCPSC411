package com.cpsc411.personsapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.cpsc411.personsapplication.adapter.SummaryListAdapter;
import com.cpsc411.personsapplication.model.Person;
import com.cpsc411.personsapplication.model.PersonDB;
import com.cpsc411.personsapplication.model.Vehicle;

import java.util.ArrayList;

public class SummaryLV extends Activity {

    ListView mSummaryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        setContentView(R.layout.person_list_lv);
        //
        createPersonObjects();
        mSummaryView = findViewById(R.id.summary_list_id);
        SummaryListAdapter ad = new SummaryListAdapter();//this is the apapter pattern
        mSummaryView.setAdapter(ad);
    }

    protected void createPersonObjects() {
        Person person = new Person("Sami ", "Halwani");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("JSDFE#", "Mercedes", "C250"));
        //vehicles.add(new Vehicle("RDE323", "BMW", "M3"));
        person.setVehicles(vehicles);
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person);

        person = new Person("John ", "Doe");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("JGE32Dj", "Subaru", "WRX STI"));
        person.setVehicles(vehicles);
        persons.add(person);

        PersonDB.getInstance().setPersonList(persons);
    }
}
