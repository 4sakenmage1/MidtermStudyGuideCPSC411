package com.cpsc411.personsapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.cpsc411.personsapplication.model.Person;
import com.cpsc411.personsapplication.model.PersonDB;

public class PersonalDetailsActivity extends AppCompatActivity {

    protected Menu detailMenu;
    protected int personIndex;
    protected  Person personObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        personIndex = getIntent().getIntExtra("PersonIndex", 0);
        TextView tv = findViewById(R.id.display_string_id);
        //Display the Person Index
        String origStr = (String)tv.getText();
        tv.setText(origStr + personIndex);
        tv.setTextSize(24);
        //
        personObj = PersonDB.getInstance().getPersonList().get(personIndex);
        //
        EditText editView = findViewById(R.id.p_first_name_id);
        editView.setText(personObj.getFirstName());
        editView.setEnabled(false);
        editView = findViewById(R.id.p_last_name_id);
        editView.setText(personObj.getLastName());
        editView.setEnabled(false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { // gives you that 3 dotted menu button
        // Custom Menu inflation
        getMenuInflater().inflate(R.menu.detain_screen_menu, menu);
        menu.findItem(R.id.action_edit).setVisible(true);
        menu.findItem(R.id.action_done).setVisible(false);
        detailMenu = menu;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { //.. you are now on this option you selected, no what can you do..
        if (item.getItemId() == R.id.action_edit) {
            EditText editView = findViewById(R.id.p_first_name_id);
            editView.setEnabled(true);
            editView = findViewById(R.id.p_last_name_id);
            editView.setEnabled(true);
            //
            item.setVisible(false);
            detailMenu.findItem(R.id.action_done).setVisible(true);
        } else if (item.getItemId() == R.id.action_done) {
            EditText editView = findViewById(R.id.p_first_name_id);
            PersonDB.getInstance().getPersonList().get(personIndex).setFirstName(editView.getText().toString());
            editView.setEnabled(false);
            editView = findViewById(R.id.p_last_name_id);
            PersonDB.getInstance().getPersonList().get(personIndex).setLastName(editView.getText().toString());
            editView.setEnabled(false);
            item.setVisible(false);
            detailMenu.findItem(R.id.action_edit).setVisible(true);
        }
        return super.onOptionsItemSelected(item);
    }
}
