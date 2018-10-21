package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Language extends AppCompatActivity {

    ListView langLv;
    String[] langList = new String[] {"Amharic", "Afaan Oromoo", "English", "Tigring"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        Button amhbutton = (Button) findViewById(R.id.amharic);
        amhbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
                Intent result = new Intent(getApplicationContext(), AmharicBrowseCategory.class);
                startActivity(result);
            }
        });

        Button ormbutton = (Button) findViewById(R.id.afaanoromo);
        ormbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
                Intent result1 = new Intent(getApplicationContext(), AfaanOromoBrowse.class);
                startActivity(result1);
            }
        });

        Button eng = (Button) findViewById(R.id.english);
        eng.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
                Intent result1 = new Intent(getApplicationContext(), BrowsebyCategory.class);
                startActivity(result1);
            }
        });

    }
}
