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
public class SimpleInterest extends Fragment implements View.OnClickListener {

    EditText etPrinciple, etTime, etRate;
    Button btnSimpleInterestC;
    TextView tvMessage;

    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);


        etPrinciple = view.findViewById(R.id.etPrinciple);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTime);
        btnSimpleInterestC = view.findViewById(R.id.btnSimpleInterestC);
        tvMessage = view.findViewById(R.id.tvMessage);

        btnSimpleInterestC.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int principle = Integer.parseInt(etPrinciple.getText().toString());
        float rate = Float.parseFloat(etRate.getText().toString());
        float time = Float.parseFloat(etTime.getText().toString());

        float simpleinterest = (principle * time * rate)/100;

        tvMessage.setText("Simple Interest of Rs : " + principle + " is Rs " + simpleinterest);

    }
}
