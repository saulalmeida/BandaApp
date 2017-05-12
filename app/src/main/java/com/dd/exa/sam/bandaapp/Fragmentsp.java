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

public class Fragmentsp extends Fragment {

    private EditText pi;
    private EditText pd;
    private EditText dp;
    private double Vpi;
    private double Vpd;
    private double Vdp;
    private double Vsp;
    private TextView sp;
    private Button Bsp;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragmentsp,container,false);

        sp = (TextView)view.findViewById(R.id.SP);

        pi = (EditText)view.findViewById(R.id.PI);
        pd = (EditText)view.findViewById(R.id.PD);
        dp = (EditText)view.findViewById(R.id.DP);

        Bsp = (Button)view.findViewById(R.id.BSP);

        Bsp.setOnClickListener(new View.OnClickListener() {
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
            Vdp = Double.parseDouble(dp.getText().toString());
        } catch (Exception e){
            Toast.makeText(getContext(),"Agrega un numero valido ",Toast.LENGTH_LONG).show();
            return;
        }
        Vsp = ((Vpi)*(Vpd/100)/Vdp);

        sp.setText(Vsp+"");

    }
}
