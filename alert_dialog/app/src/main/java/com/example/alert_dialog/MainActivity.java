package com.example.alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =findViewById(R.id.alert_btn);
        btn.setOnClickListener(this::onClick);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.alert_btn) {
            alertDialog();
        }
    }
    private void alertDialog() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Do you wish to continue ?");
        dialog.setTitle("Are you sure ?");
        dialog.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                    }
                });
        dialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Cancel is clicked",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }
}




