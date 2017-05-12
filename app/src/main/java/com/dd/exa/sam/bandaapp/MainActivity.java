package com.dd.exa.sam.bandaapp;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner  Spinner  = (Spinner) findViewById(R.id.formulas);

        List<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("SP");
        spinnerArray.add("GB");
        spinnerArray.add("RB");
        spinnerArray.add("PT");
        spinnerArray.add("PI");
        spinnerArray.add("Calibracion RR");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner.setAdapter(adapter);
        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                String str = (String)parent.getSelectedItem();
                Fragment fragment = null;

                switch(position){

                    case 0:
                        fragment = new Fragmentsp();
                        break;
                    case 1:
                        fragment = new Fragmentgb();
                        break;
                    case 2:
                        fragment = new Fragmentrb();
                        break;
                    case 3:
                        fragment = new Fragmentpt();
                        break;
                    case 4:
                        fragment = new Fragmentpi();
                        break;
                    case 5:
                        fragment = new FragmentCal();
                }
                if (fragment!=null) {
                    fragmentManager.beginTransaction().replace(R.id.inicio,fragment).commit();
                }

                Toast.makeText(getApplicationContext(),"Seleccionó : "+str,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }


}
