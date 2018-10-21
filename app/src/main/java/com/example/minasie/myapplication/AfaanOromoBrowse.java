package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AfaanOromoBrowse extends AppCompatActivity {
    //Array of Category
    ListView categoryLv;
    String[] categoryList = new String[] {"Waa'e Hafuura Qulqulluu", "Waa'e Ayyaana",
            "Barsiisa Sobaa","Waa'e Hafuura Qulqulluu", "Waa'e Ayyaana", "Barsiisa Sobaa",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afaan_oromo_browse);

        categoryLv = (ListView)findViewById(R.id.oromoCategory);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, categoryList);
        categoryLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        categoryLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent result = new Intent(getApplicationContext(), AfaanOromoListOfCategory.class);
                startActivity(result);
            }
        });
    }
}
