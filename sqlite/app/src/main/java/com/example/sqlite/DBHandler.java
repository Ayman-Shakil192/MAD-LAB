package com.example.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "BOOKS_DB";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "BOOKS";
    private static final String ID_COL = "BOOK_ID";
    private static final String NAME_COL = "BOOK_NAME";
    private static final String AUTHOR_COL = "AUTHOR_NAME";
    private static final String PATRON_COL = "PATRON_NAME";
    private static final String GENRE_COL = "GENRE";

    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + AUTHOR_COL + " TEXT,"
                + PATRON_COL + " TEXT,"
                + GENRE_COL + " TEXT)";
        db.execSQL(query);
    }

    // this method is use to add new books to our sqlite database.
    public void addNewBooks(String BookName, String AuthorName, String PatronName, String Genre) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME_COL, BookName);
        values.put(AUTHOR_COL, AuthorName);
        values.put(PATRON_COL, PatronName);
        values.put(GENRE_COL, Genre);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

