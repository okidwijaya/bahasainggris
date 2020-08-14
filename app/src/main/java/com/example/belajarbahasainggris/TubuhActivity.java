package com.example.belajarbahasainggris;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TubuhActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tubuh);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_tubuh);
        show = (ImageButton) findViewById(R.id.kepala);
        hide = (ImageButton) findViewById(R.id.rambut);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view){
                    TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        //Menambahkan Button Suara

        //memanggil suara
        final MediaPlayer suaraKepala = MediaPlayer.create(this, R.raw.head);
        final MediaPlayer suaraRambut = MediaPlayer.create(this, R.raw.hair);
        final MediaPlayer suaraAlis = MediaPlayer.create(this, R.raw.eyebrow);
        final MediaPlayer suaraMata = MediaPlayer.create(this, R.raw.eye);
        final MediaPlayer suaraHidung = MediaPlayer.create(this, R.raw.nose);
        final MediaPlayer suaraMulut = MediaPlayer.create(this, R.raw.mouth);
        final MediaPlayer suaraTelinga = MediaPlayer.create(this, R.raw.ear);
        final MediaPlayer suaraTangan = MediaPlayer.create(this, R.raw.hand);
        final MediaPlayer suaraJari= MediaPlayer.create(this, R.raw.finger);
        final MediaPlayer suaraLutut = MediaPlayer.create(this, R.raw.knee);
        final MediaPlayer suaraKaki = MediaPlayer.create(this, R.raw.foot);

        //variable button suara
        ImageButton ButtonSuara = (ImageButton)this.findViewById(R.id.kepala);
        ImageButton ButtonSuara2 = (ImageButton)this.findViewById(R.id.rambut);
        ImageButton ButtonSuara3 = (ImageButton)this.findViewById(R.id.alis);
        ImageButton ButtonSuara4 = (ImageButton)this.findViewById(R.id.mata);
        ImageButton ButtonSuara5 = (ImageButton)this.findViewById(R.id.hidung);
        ImageButton ButtonSuara6 = (ImageButton)this.findViewById(R.id.mulut);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.telinga);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.tangan);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.jari);
        ImageButton ButtonSuara10 = (ImageButton)this.findViewById(R.id.lutut);
        ImageButton ButtonSuara11 = (ImageButton)this.findViewById(R.id.kaki);

        /*Menghidupkan Suara */

        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_kepala);
                TampilGambar.startAnimation(animScale);
                suaraKepala.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_rambut);
                TampilGambar.startAnimation(animScale);
                suaraRambut.start();
        }
    });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_alis);
                TampilGambar.startAnimation(animScale);
                suaraAlis.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_mata);
                TampilGambar.startAnimation(animScale);
                suaraMata.start();
            }
        });

        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_hidung);
                TampilGambar.startAnimation(animScale);
                suaraHidung.start();
            }
        });

        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_mulut);
                TampilGambar.startAnimation(animScale);
                suaraMulut.start();
            }
        });

        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_telinga);
                TampilGambar.startAnimation(animScale);
                suaraTelinga.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_tangan);
                TampilGambar.startAnimation(animScale);
                suaraTangan.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_jari);
                TampilGambar.startAnimation(animScale);
                suaraJari.start();
            }
        });

        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_lutut);
                TampilGambar.startAnimation(animScale);
                suaraLutut.start();
            }
        });

        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tubuh_kaki);
                TampilGambar.startAnimation(animScale);
                suaraKaki.start();
            }
        });

    }
}