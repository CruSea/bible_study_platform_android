package com.example.minasie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AmharicBrowseCategory extends AppCompatActivity {

    //Array of Category
    ListView categoryLv;
    String[] categoryList = new String[] {"ስለ የእግዚአብሔር መንግሥት የምሥራች", "ሰﹱለ መ﹧ነፈﹱ ቀﹱደ﹵ሰﹱ", "ገ﹧ጀገነ﹧ጀነገ﹧ነገ﹧ነጀገ﹧",
            "ሰﹱለ ሀ﹧ሰተ ተﹱመﹱረተﹳቸሀﹱ", "ቀየተ﹵ተ ﹳገገ﹧ሀገ﹧ ﹳ", "ገ﹧ገ﹧ተየ﹵ተ﹧ቀ﹧ ገሀቀﹳቀየሀገ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amharic_browse_category);

        categoryLv = (ListView)findViewById(R.id.amharicCategory);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, categoryList);
        categoryLv.setAdapter(arrayAdapter);

        //set on click for the ListVIew
        categoryLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent result = new Intent(getApplicationContext(), AmharicListOfCategory.class);
                startActivity(result);
            }
        });
    }
}
