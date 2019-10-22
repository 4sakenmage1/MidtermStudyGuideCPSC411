package com.example.midtermpractice.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.midtermpractice.PersonalDetailsActivity;
import com.example.midtermpractice.R;
import com.example.midtermpractice.models.Person;
import com.example.midtermpractice.models.PersonDB;

import org.w3c.dom.Text;

public class SummaryListAdapter extends BaseAdapter {
    @Override
    public int getCount(){
        return PersonDB.getOurInstance().getPersonList().size();
    }

    @Override
    public Object getItem(int i){
        return PersonDB.getOurInstance().getPersonList().get(i);
    }
    @Override
    public long getItemId(int i){
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup){
        View row_view;

        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.person_row, viewGroup, false);
        } else
        {
            row_view = view;
        }

        Person p = PersonDB.getOurInstance().getPersonList().get(i);

        ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
        ((TextView) row_view.findViewById(R.id.last_name)).setText(p.getLastname());

        row_view.setTag(new Integer(i));

        row_view.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){

                        Toast.makeText(view.getContext(), "View Object was touched by user.", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(view.getContext(), PersonalDetailsActivity.class);
                        intent.putExtra("PersonIndex", ((Integer)view.getTag()).intValue());
                        view.getContext().startActivity(intent);
                    }
                }
        );
        return row_view;
    }
}
