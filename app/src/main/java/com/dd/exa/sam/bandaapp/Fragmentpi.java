package com.dd.exa.sam.bandaapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by manu on 01/03/2017.
 */

public class Fragmentpi extends Fragment {

    private EditText pp;
    private EditText cf;
    private TextView pi;
    private Button Bpi;
    private double Vpp;
    private double Vcf;
    private double Vpi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentpi,container,false);

        pi = (TextView)view.findViewById(R.id.PI);

        pp = (EditText)view.findViewById(R.id.PP);
        cf = (EditText)view.findViewById(R.id.CF);

        Bpi = (Button)view.findViewById(R.id.BPI);

        Bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcula();
            }
        });
        return view;
    }

    private void calcula(){
        try {
            Vpp = Double.parseDouble(pp.getText().toString());
            Vcf = Double.parseDouble(cf.getText().toString());
        }catch (Exception e){
            Toast.makeText(getContext(),"Agrega un numero valido ",Toast.LENGTH_LONG).show();
            return;
        }

            Vpi = (Vpp * Vcf);
        pi.setText(Vpi+"");

    }
}
