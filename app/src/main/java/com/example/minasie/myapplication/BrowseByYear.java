package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BrowseByYear extends AppCompatActivity {

    //Array of Category
    ListView yearLv;
    String[] yearList = new String[] {"2010", "2011", "2012", "2012", "2013",
            "2010", "2011", "2012", "2012", "2013"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_by_year);
        yearLv = (ListView) findViewById(R.id.year);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, yearList);
        yearLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        yearLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent result = new Intent(getApplicationContext(), ListOfCategory.class);
                startActivity(result);
            }
        });
    }
}
