package com.shallow.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shallow.secondassignment.fragments.AreaOfCircle;
import com.shallow.secondassignment.fragments.ArmstrongNumber;
import com.shallow.secondassignment.fragments.AutomorphicNumber;
import com.shallow.secondassignment.fragments.PalindromeNumber;
import com.shallow.secondassignment.fragments.SimpleInterest;
import com.shallow.secondassignment.fragments.Swap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAoc;
    private Button btnPn;
    private Button btnSi;
    private Button btnAn;
    private Button btnAmn;
    private Button btnSwap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btnAoc = findViewById(R.id.btnAoc);
        btnAn = findViewById(R.id.btnAn);
        btnAmn = findViewById(R.id.btnAmn);
        btnPn = findViewById(R.id.btnPN);
        btnSi = findViewById(R.id.btnSi);
        btnSwap =findViewById(R.id.btnSwap);

        btnAoc.setOnClickListener(this);
        btnAn.setOnClickListener(this);
        btnAmn.setOnClickListener(this);
        btnPn.setOnClickListener(this);
        btnSi.setOnClickListener(this);
        btnSwap.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.btnAoc:
                AreaOfCircle areaOfCircle = new AreaOfCircle();
                fragmentTransaction.replace(R.id.FragmentContainer, areaOfCircle);
                fragmentTransaction.commit();
                break;


            case R.id.btnAn:
                ArmstrongNumber armstrongNumber = new ArmstrongNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, armstrongNumber);
                fragmentTransaction.commit();
                break;


            case R.id.btnAmn:
                AutomorphicNumber automorphicNumber = new AutomorphicNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, automorphicNumber);
                fragmentTransaction.commit();
                break;

            case R.id.btnPN:
                PalindromeNumber palindromeNumber = new PalindromeNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, palindromeNumber);
                fragmentTransaction.commit();
                break;

            case R.id.btnSi:
                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.FragmentContainer, simpleInterest);
                fragmentTransaction.commit();
                break;

            case R.id.btnSwap:
                Swap swappingNumber = new Swap();
                fragmentTransaction.replace(R.id.FragmentContainer, swappingNumber);
                fragmentTransaction.commit();
                break;
        }

    }
}
