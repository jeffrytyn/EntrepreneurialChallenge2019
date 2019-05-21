package com.example.jeffreyt.challenge;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {


    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment1, container, false);
        //powerIn = (EditText) getView().findViewById(R.id.powerIn);
        //VehicIn = (EditText) getView().findViewById(R.id.VehiclesIn);
        Button button1 = (Button)view.findViewById(R.id.buttonP);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText powerIn = (EditText) getView().findViewById(R.id.powerIn);
                TextView powerOut = getView().findViewById(R.id.powerOut);
                int value= Integer.parseInt(powerIn.getText().toString());
                double finalValue = Math.round(value * 1.004 * 0.453592);
                powerOut.setText(finalValue + "kg CO2");
                powerOut.setTextColor(getResources().getColor(R.color.black));
            }
        });
        Button button2 = (Button)view.findViewById(R.id.buttonV);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText VehicIn = (EditText) getView().findViewById(R.id.VehiclesIn);
                TextView VehicOut = getView().findViewById(R.id.VehiclesOut);
                int value= Integer.parseInt(VehicIn.getText().toString());
                double finalValue = Math.round(value * 8.91);
                VehicOut.setText(finalValue + "kg CO2");
                VehicOut.setTextColor(getResources().getColor(R.color.black));
            }
        });
        // Inflate the layout for this fragment
        return view;

    }
    /*public void calculatePower(View view){
        EditText powerIn = (EditText) getView().findViewById(R.id.powerIn);
        TextView powerOut = getView().findViewById(R.id.powerOut);
        int value= Integer.parseInt(powerIn.getText().toString());
        double finalValue = value * 1.004 * 0.453592;
        powerOut.setText(finalValue + "kg CO2");
    }

    public void calculateVehic(View view){
        EditText VehicIn = (EditText) getView().findViewById(R.id.VehiclesIn);
        TextView VehicOut = getView().findViewById(R.id.VehiclesOut);
        int value= Integer.parseInt(VehicIn.getText().toString());
        double finalValue = value * 8.91;
        VehicOut.setText(finalValue + "kg CO2");
    }*/


}
