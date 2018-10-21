package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WeekList extends AppCompatActivity {

    //Array of Category
    ListView listLv;
    String[] list_of_catg= new String[] {"Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 10",
            "Week 11", "Week 12", "Week 13", "Week 14", "Week 15", "Week 16"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_list);

        listLv = (ListView)findViewById(R.id.weeklist);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list_of_catg);
        listLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        listLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent result = new Intent(getApplicationContext(), CategoryView.class);
                startActivity(result);
            }
        });
    }
}
