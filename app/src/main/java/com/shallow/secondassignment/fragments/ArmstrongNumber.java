package com.shallow.secondassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.shallow.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArmstrongNumber extends Fragment implements View.OnClickListener {

    EditText etArmstrong;
    Button btnArmstrongC;
    TextView tvMessage;

    public ArmstrongNumber() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong_number, container, false);

        etArmstrong = view.findViewById(R.id.etArmstrong);
        tvMessage = view.findViewById(R.id.tvMessage);
        btnArmstrongC = view.findViewById(R.id.btnArmstrongC);

        btnArmstrongC.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etArmstrong.getText().toString());
        int originalNum, remainder;
        int result = 0;
        originalNum = num;
        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        if(result == num){
            tvMessage.setText(num + " is a Armstrong number");
        }else{
            tvMessage.setText(num + " is not a Armstrong number");
        }

    }
}
