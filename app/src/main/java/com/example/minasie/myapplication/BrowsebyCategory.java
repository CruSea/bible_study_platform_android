package com.example.minasie.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BrowsebyCategory extends AppCompatActivity {

    //Array of Category
    ListView categoryLv;
    String[] categoryList = new String[] {"About HolySpirit", "About Grace", "About HolySpirit", "About False Teaching",
            "About Grace", "About HolySpirit Gift", "About False Teaching"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browseby_category);

        categoryLv = (ListView)findViewById(R.id.category);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, categoryList);
        categoryLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        categoryLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent result = new Intent(getApplicationContext(), ListOfCategory.class);
                startActivity(result);
            }
        });

    }
}
