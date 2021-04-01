package com.example.activity3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Hasil extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hasil);
        //Deklarasi variabel untuk EdiText
        txEmail = findViewById(R.id.tvEmail);
        //Deklarasi variabel untuk menyimpan email dan password
        txPassword = findViewById(R.id.tviewpassword);
        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("a");
        String Password = bundle.getString("b");
        txEmail.setText(email);
        txPassword.setText(Password);

    }
}