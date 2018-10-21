package com.example.minasie.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class YearView extends AppCompatActivity {
    ListView termLv;
    String weekList[] = {"week 1", "week 2", "week 4", "week 5", "week 6",
            "week 7", "week 8", "week 9", "week 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_view);
    }
}
