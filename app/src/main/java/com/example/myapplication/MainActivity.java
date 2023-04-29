package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText loan_amount;
    private TextView interest;
    private Button small_bank, big_bank;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loan_amount = findViewById(R.id.loan_amount);
        interest = findViewById(R.id.interest);
        small_bank = findViewById(R.id.small_bank);
        big_bank = findViewById(R.id.big_bank);

        small_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SmallBank newBank = new SmallBank(getText(setTextLoan(interest)));
            }
        });
                big_bank.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //BigBank newBank = new BigBank(getText(setTextLoan(interest)));
                    }
                }));
    }
    /*public int setTextLoan (View view){
        EditText text = findViewById(R.id.loan_amount);
        String value = text.getText().toString();

        return view;
    }*/

}