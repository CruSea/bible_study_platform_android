package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AfaanOromoListOfCategory extends AppCompatActivity {

    //Array of Category
    ListView listLv;
    String[] list_of_catg= new String[] {"Hafuurri QUlqulluun Eenyu?", "Kennaawwan Hafuura QUlqulluu",
            "hafuura qulqulluun cuuphamuu", "Hafuurri QUlqulluun Eenyu?", "Kennaawwan Hafuura QUlqulluu",
            "hafuura qulqulluun cuuphamuu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afaan_oromo_list_of_category);

        listLv = (ListView)findViewById(R.id.ormcategorylist);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list_of_catg);
        listLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        listLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent result = new Intent(getApplicationContext(), AfaanOromoCategoryView.class);
                startActivity(result);
            }
        });
    }
}
