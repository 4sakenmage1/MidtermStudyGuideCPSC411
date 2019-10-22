package com.cpsc411.personsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cpsc411.personsapplication.model.Person;
import com.cpsc411.personsapplication.model.Vehicle;
import com.cpsc411.personsapplication.model.PersonDB;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.person_list);

        root = findViewById(R.id.person_list);

        ArrayList<Person> personList = PersonDB.getInstance().getPersonList();
        for(int i=0; i<personList.size(); i++) {
            Person p = personList.get(i);
            //
            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.person_row, root, false);
            //
            ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
            root.addView(row_view);
        }
    }


}
