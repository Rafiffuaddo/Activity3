package com.example.activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Hasil extends AppCompatActivity {
    TextView txEmail, txPassword;
}

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

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //menghubungkan variabel edemail dengan componen button pada layout
            edemail = findViewById(R.id.edEmail);

            //Menghubungkan variabel edpassword dengan componen button pada layout
            edpassword = findViewById(R.id.edPassword);

            //membuat fungsi onclick pada button btnlogin
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //menyimpan input user di edittext email kedalam variabel nama
                    nama = edemail.getText().toString();

                    //menyimpan input user di edittext password kedalam variabel password
                    password = edpassword.getText().toString();

                    //mengeset email yang benar
                    String email = "admin@mailcom";

                    //mengeset password yang  benar
                    String pass = "123";

                    //mengecek apakah editText dan password terdapat isi atau tidak
                    if (nama.isEmpty() || password.isEmpty()) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Email dan password wajib diisi!!!",
                                Toast.LENGTH_LONG);
                        //menampilkan toast
                        t.show();
                    } else {

                        //mengecek apakah isi dari email dan password sudah sama dengan email dan
                        //password yang sudaj diset
                        if (nama.equals(email) && password.equals(pass)) {
                            //membuat variabel toast dan menampilkan pesan "login sukses"
                            Toast t = Toast.makeText(getApplicationContext(),
                                    "Login Sukses",
                                    Toast.LENGTH_LONG);

                            //menampilkan toast
                            t.show();

                            //membuat objek bundle
                            Bundle b = new Bundle();

                            //memasukkan value dari variabel nama dengan kunci "a"
                            //dan dimasukkan kedalam bundle
                            b.putString("b", password.trim());

                            //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                            Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                            //membuat bundle kedalam intent untuk dikirimkan kedalam ke ActivityHasil
                            i.putExtras(b);

                            //berpindah ke ActivityHasil
                            startActivity(i);
                        } else {
                            //membuat variabel toast dan membuat toast dan menampilkan pesan :login gagal'
                            Toast t = Toast.makeText(getApplicationContext(),
                                    "Login Gagal", Toast.LENGTH_LONG);

                            //memanpilkan toast
                            t.show();
                        }
                    }
                }
            });
        }
    }