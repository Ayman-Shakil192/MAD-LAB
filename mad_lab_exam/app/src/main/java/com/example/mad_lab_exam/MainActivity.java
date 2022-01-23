package com.example.mad_lab_exam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String[] cityList = {"Dubai","Delhi","Mumbai","New York","Jakarta","Paris","London","Tokyo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textview,cityList);
        simpleList.setAdapter(arrayAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                Toast.makeText(MainActivity.this,"You chose "+ cityList[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
