package com.example.array_adapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String[] AnimalList = {"Lion","Tiger","Monkey","Kangaroo","Dog","Cat","Camel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textview,AnimalList);
        simpleList.setAdapter(arrayAdapter);
    }
}