package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Tanggal Pengerjaan : 7 May 2021
//Deskripsi Pengerjaan : menghubungkan activity_welcome dengan activity_code
//NIM : 10118048
//Nama : Niko Yama
//Kelas : IF-2

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnMulai = findViewById(R.id.btn_mulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CodeActivity.class);
                startActivity(intent);
            }
        });
    }
}