package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//Tanggal Pengerjaan : 7 May 2021
//Deskripsi Pengerjaan : menghubungkan activity_bio dengan activity_finish dan menyimpan/mengirim variabel nama
//NIM : 10118048
//Nama : Niko Yama
//Kelas : IF-2

public class BioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        Button btnSelanjutnya = findViewById(R.id.btn_selanjutnya);
        EditText edtNama = findViewById(R.id.edt_nama);
        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FinishActivity.class);
                String nama = edtNama.getText().toString();
                intent.putExtra("name", nama);
                startActivity(intent);
            }
        });


    }
}