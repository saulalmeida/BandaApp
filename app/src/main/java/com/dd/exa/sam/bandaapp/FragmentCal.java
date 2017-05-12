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

/**
 * Created by manu on 01/03/2017.
 */

public class FragmentCal extends Fragment  {

    private EditText rt;
    private EditText pr;
    private EditText ptc;
    private TextView rr;
    private Button Brr;
    private double Vrt;
    private double Vpr;
    private double Vptc;
    private double Vrr;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentcal,container,false);

        rr = (TextView)view.findViewById(R.id.RR);

        rt = (EditText)view.findViewById(R.id.RT);
        pr = (EditText)view.findViewById(R.id.PR);
        ptc = (EditText)view.findViewById(R.id.PTC);

        Brr = (Button)view.findViewById(R.id.BRR);

        Brr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcula();
            }
        });

        return view;
    }

    private void calcula(){
        try {
            Vrt = Double.parseDouble(rt.getText().toString());
            Vpr = Double.parseDouble(pr.getText().toString());
            Vptc = Double.parseDouble(ptc.getText().toString());
        }catch (Exception e){
            Toast.makeText(getContext(),"Agrega un numero valido ",Toast.LENGTH_LONG).show();
            return;
        }

            Vrr = (Vrt * Vpr) / Vptc;
            rr.setText(Vrr+"");



    }
}
