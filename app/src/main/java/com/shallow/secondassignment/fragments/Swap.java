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
public class Swap extends Fragment implements View.OnClickListener {

    EditText etFirst, etSecond;
    Button btnSwap;
    TextView tvMessage;

    public Swap() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap, container, false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnSwap = view.findViewById(R.id.btnSwap);
        tvMessage = view.findViewById(R.id.tvMessage);

        btnSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int firstnumber = Integer.parseInt(etFirst.getText().toString());
        int secondnumber = Integer.parseInt(etSecond.getText().toString());

        firstnumber = firstnumber + secondnumber;
        secondnumber = firstnumber - secondnumber;
        firstnumber = firstnumber - secondnumber;

        tvMessage.setText("After swapping value of first number is " + firstnumber + " and value of second number is " + secondnumber);

    }
}
