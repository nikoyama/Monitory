package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

//Tanggal Pengerjaan : 7 May 2021
//Deskripsi Pengerjaan : menggunakan varibel nama yang sudah dikirim dari activity_bio
//NIM : 10118048
//Nama : Niko Yama
//Kelas : IF-2

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Intent intent = getIntent();
        String nama = intent.getStringExtra("name");
        TextView txtFinish = findViewById(R.id.txt_finish);
        txtFinish.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP mu " +
                "tiap hari buat bantu " + nama + " ngatur waktu :)");
    }
}