package com.facebook.www;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Spinner spinner_view=findViewById(R.id.spinner_view);
        ArrayList<String> list = new ArrayList<String>();
        list.add("12");
        list.add("12");
        list.add("12");
        list.add("12");
        list.add("12");
        list.add("12");
        list.add("12");
        list.add("12");
        ArrayAdapter<String> stringadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        spinner_view.setAdapter(stringadapter);



    }
}
