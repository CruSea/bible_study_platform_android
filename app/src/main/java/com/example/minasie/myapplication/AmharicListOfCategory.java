package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AmharicListOfCategory extends AppCompatActivity {

    //Array of Category
    ListView listLv;
    String[] list_of_catg = new String[] {"በእውነት መጽሐፍ ቅዱስ የእግዚአብሔር ቃል ነውን ", "መጽሐፍ ቅዱስ የእግዚአብሔር ቃል ነውን",
            "መጽሐፍ ቅዱስ የእግዚአብሔር ቃል ነውን", "መጽሐፍ ቅዱስ የእግዚአብሔር ቃል ነውንﹳ", "መጽሐፍ ቅዱስ የእግዚአብሔር ቃል ነውን"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amharic_list_of_category);

        listLv = (ListView)findViewById(R.id.amhcategorylist);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list_of_catg);
        listLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        listLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent result = new Intent(getApplicationContext(), AmharicCategoryView.class);
                startActivity(result);
            }
        });
    }
}
