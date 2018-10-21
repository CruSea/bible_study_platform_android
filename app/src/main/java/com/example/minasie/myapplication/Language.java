package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Language extends AppCompatActivity {

    ListView langLv;
    String[] langList = new String[] {"Amharic", "Afaan Oromoo", "English", "Tigring"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        langLv = (ListView)findViewById(R.id.language);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, langList);
        langLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        langLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "sorry", Toast.LENGTH_SHORT).show();
                //Intent result = new Intent(getApplicationContext(), ListOfCategory.class);
                //startActivity(result);
            }
        });
    }
}
