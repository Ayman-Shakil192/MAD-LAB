package com.example.radio_button;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_button_1:
                if (checked)
                    Toast.makeText(this,"You chose Java",Toast.LENGTH_LONG).show();
                break;
            case R.id.radio_button_2:
                if (checked)
                    Toast.makeText(this,"You chose Python",Toast.LENGTH_LONG).show();
                break;
            case R.id.radio_button_3:
                if (checked)
                    Toast.makeText(this,"You chose React JS",Toast.LENGTH_LONG).show();
                break;
            case R.id.radio_button_4:
                if (checked)
                    Toast.makeText(this,"You chose JavaScript",Toast.LENGTH_LONG).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}

