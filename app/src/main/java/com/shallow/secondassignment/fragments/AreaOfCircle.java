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
public class AreaOfCircle extends Fragment implements View.OnClickListener{

    EditText etRadius;
    Button btnAreaOfCircle;
    TextView tvMessage;
    public AreaOfCircle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area_of_circle, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnAreaOfCircle = view.findViewById(R.id.btnAreaOfCircle);
        tvMessage = view.findViewById(R.id.tvMessage);

        btnAreaOfCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius = Float.parseFloat(etRadius.getText().toString());
        Float area = 3.12f * radius *radius;

        tvMessage.setText("Area of circle is: " + area);

    }
}
