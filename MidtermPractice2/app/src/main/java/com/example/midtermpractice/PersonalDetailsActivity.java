package com.example.midtermpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.midtermpractice.models.Person;
import com.example.midtermpractice.models.PersonDB;

import org.w3c.dom.Text;

public class PersonalDetailsActivity extends Activity {

    protected Menu detailMenu;
    protected int personIndex;
    protected Person personObj;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_personal_details);

        personIndex = getIntent().getIntExtra("PersonIndex", 0);
        TextView tv = findViewById(R.id.display_string_id);
        String originalString = (String)tv.getText();
        tv.setText(originalString + " "+ personIndex);
        tv.setTextSize(24);

        personObj = PersonDB.getOurInstance().getPersonList().get(personIndex);

        EditText editView = findViewById(R.id.p_first_name_id);
        editView.setText(personObj.getFirstName());
        editView.setEnabled(false);
        editView = findViewById(R.id.p_last_name_id);
        editView.setText(personObj.getLastname());
        editView.setEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.detain_screen_menu, menu);
    menu.findItem(R.id.action_edit).setVisible(true);
    menu.findItem(R.id.action_done).setVisible(false);
    detailMenu = menu;
    return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.action_edit){
            EditText editView = findViewById(R.id.p_first_name_id);
            editView.setEnabled(true);
            editView.findViewById(R.id.p_last_name_id);
            editView.setEnabled(true);
            item.setVisible(false);
            detailMenu.findItem(R.id.action_done).setVisible(true);
        } else if(item.getItemId() == R.id.action_done){
            EditText editView = findViewById(R.id.p_first_name_id);
            PersonDB.getOurInstance().getPersonList().get(personIndex).setFirstName(editView.getText().toString());
            editView.setEnabled(false);
            editView = findViewById(R.id.p_last_name_id);
            PersonDB.getOurInstance().getPersonList().get(personIndex).setLastname(editView.getText().toString());
            editView.setEnabled(false);
            item.setVisible(false);
            detailMenu.findItem(R.id.action_edit).setVisible(true);
        }

        return super.onOptionsItemSelected(item);
    }

}
