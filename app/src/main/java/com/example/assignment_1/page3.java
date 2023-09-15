package com.example.assignment_1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class page3 extends AppCompatActivity{
    String[] countryNames={"Pakistan","India","USA","RWP","Kashmir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.country_spinner);
        spin.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


        //Creating the ArrayAdapter instance having the bank name list

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,countryNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }



    //Performing action onItemSelected and onNothing selected

    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), countryNames[position], Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }

}




