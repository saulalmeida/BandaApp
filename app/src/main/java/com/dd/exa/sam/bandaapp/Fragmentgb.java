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
 * Created by manu on 28/02/2017.
 */

public class Fragmentgb extends Fragment {

    private EditText sp;
    private EditText cb;
    private TextView gb;
    private Button Bgb;
    private double Vsp;
    private double Vcb;
    private double Vgb;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentgb,container,false);

        gb = (TextView)view.findViewById(R.id.GB);

        sp = (EditText)view.findViewById(R.id.SP);
        cb = (EditText)view.findViewById(R.id.CB);

        Bgb = (Button)view.findViewById(R.id.BGB);

        Bgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcula();
            }
        });

        return view;

    }
    private void calcula(){
        try {
            Vsp = Double.parseDouble(sp.getText().toString());
            Vcb = Double.parseDouble(cb.getText().toString());
        }catch (Exception e){
            Toast.makeText(getContext(),"Agrega un numero valido ",Toast.LENGTH_LONG).show();
            return;
        }
            Vgb = (Vsp / Vcb);

        gb.setText(Vgb+"");
    }


}


