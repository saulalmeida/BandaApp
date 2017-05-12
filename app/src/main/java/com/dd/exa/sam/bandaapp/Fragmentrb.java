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

import org.w3c.dom.Text;

/**
 * Created by manu on 01/03/2017.
 */

public class Fragmentrb extends Fragment {

    private EditText gb;
    private EditText tc;
    private TextView rb;
    private Button Brb;
    private double Vgb;
    private double Vtc;
    private double Vrb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentrb,container,false);

        rb = (TextView)view.findViewById(R.id.RB);

        gb = (EditText)view.findViewById(R.id.GB);
        tc = (EditText)view.findViewById(R.id.TC);

        Brb = (Button)view.findViewById(R.id.BRB);

        Brb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcula();
            }
        });

        return view;
    }

    private void calcula(){
        try {
            Vgb = Double.parseDouble(gb.getText().toString());
            Vtc = Double.parseDouble(tc.getText().toString());
        }catch (Exception e){
            Toast.makeText(getContext(),"Agrega un numero valido ",Toast.LENGTH_LONG).show();
            return;
        }

            Vrb = (Vgb/Vtc)*60;

        rb.setText(Vrb+"");
    }
}
