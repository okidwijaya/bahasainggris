package com.example.belajarbahasainggris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Menu Tubuh
        pindah = (ImageButton) findViewById (R.id.button_tubuh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(BelajarActivity.this,TubuhActivity.class);
                startActivity(pindah);
            }
        });

        //Menu Buah dan Sayur
        pindah = (ImageButton) findViewById(R.id.button_buahdansayur);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(BelajarActivity.this,BuahdansayurActivity.class);
                startActivity(pindah);
            }
        });

        //Menu Binatang
        pindah = (ImageButton) findViewById(R.id.button_binatang);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(BelajarActivity.this,BinatangActivity.class);
                startActivity(pindah);
            }
        });

        //Menu Ruang Kelas
        pindah = (ImageButton) findViewById(R.id.button_ruangkelas);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(BelajarActivity.this,KelasActivity.class);
                startActivity(pindah);
            }
        });

        //Menu Keluarga
        pindah = (ImageButton) findViewById(R.id.button_keluarga);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(BelajarActivity.this,KeluargaActivity.class);
                startActivity(pindah);
            }
        });
    }
}