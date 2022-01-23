package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] countryList = {"India","Germany","France","Australia","Canada","Qatar"};
    int[] countryImages = {R.drawable.india,R.drawable.germany,R.drawable.france,R.drawable.australia,R.drawable.canada,R.drawable.qatar};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter CustomBaseAdapter = new CustomBaseAdapter(getApplicationContext(),countryList,countryImages);
        listView.setAdapter(CustomBaseAdapter);
    }
}