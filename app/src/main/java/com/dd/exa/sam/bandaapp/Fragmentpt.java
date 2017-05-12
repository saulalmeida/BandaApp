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

public class Fragmentpt extends Fragment {

    private EditText pi;
    private EditText pd;
    private double Vpi;
    private double Vpd;
    private double Vpt;
    private Button Bpt;
    private TextView pt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentpt,container,false);

        pt = (TextView)view.findViewById(R.id.PT);

        pi = (EditText)view.findViewById(R.id.PI);
        pd = (EditText)view.findViewById(R.id.PD);

        Bpt = (Button)view.findViewById(R.id.BPT);

        Bpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcula();
            }
        });

        return view;
    }

    private void calcula(){

        try {
            Vpi = Double.parseDouble(pi.getText().toString());
            Vpd = Double.parseDouble(pd.getText().toString());
        }catch (Exception e){
            Toast.makeText(getContext(),"Agrega un numero valido ",Toast.LENGTH_LONG).show();
            return;
        }
        Vpt = (Vpi*Vpd)/100;

        pt.setText(Vpt+"");
    }
}
