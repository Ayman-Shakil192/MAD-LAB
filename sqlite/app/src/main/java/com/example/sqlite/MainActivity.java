package com.example.sqlite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText NameEdt, AuthorEdt, PatronEdt, GenreEdt;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing all our variables.
        NameEdt = findViewById(R.id.et1);
        AuthorEdt = findViewById(R.id.et2);
        PatronEdt = findViewById(R.id.et3);
        GenreEdt = findViewById(R.id.et4);
        Button addBooksBtn = findViewById(R.id.btn);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(MainActivity.this);

        // below line is to add on click listener for our add books button.
        addBooksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String BooksName = NameEdt.getText().toString();
                String AuthorName = AuthorEdt.getText().toString();
                String PatronName = PatronEdt.getText().toString();
                String Genre = GenreEdt.getText().toString();

                // validating if the text fields are empty or not.
                if (BooksName.isEmpty() && AuthorName.isEmpty() && PatronName.isEmpty() && Genre.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the required fields...", Toast.LENGTH_LONG).show();
                    return;
                }

                // on below line we are calling a method to add new
                // books to sqlite data and pass all our values to it.
                dbHandler.addNewBooks(BooksName, AuthorName, PatronName, Genre);

                // after adding the data we are displaying a toast message.
                Toast.makeText(MainActivity.this, "Book details have been added.", Toast.LENGTH_LONG).show();
                NameEdt.setText("");
                AuthorEdt.setText("");
                PatronEdt.setText("");
                GenreEdt.setText("");
            }
        });
    }
}
