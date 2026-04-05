package com.example.miprimeraapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="amigos";
    private static final int DATABASE_VERSION=1;
    private static final String SQLdb = "CREATE TABLE amigos (idAmigos INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, direccion TEXT, telefono TEXT, email TEXT, dui TEXT, urlFoto TEXT)";
    public DB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLdb);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       //actualizar la base de datos
    }
    public String eeadministrar_amigos(String accion, String [] datos ){
        try{
            SQLiteDatabase db=getWritableDatabase();
            String mensaje="ok" , sql = "";
            switch (accion){
                case "nuevo";
                sql="";
                break;
            }
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

}
