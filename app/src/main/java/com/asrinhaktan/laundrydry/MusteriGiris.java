package com.asrinhaktan.laundrydry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MusteriGiris extends AppCompatActivity {



    public EditText e_musteriID;
    public Button geri_don;
    public Button btn_mGiris2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musteri_giris);

        e_musteriID=findViewById(R.id.musteriID);
        btn_mGiris2=findViewById(R.id.mGiris2);
        geri_don=findViewById(R.id.geri);

        geri_don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri_don = new Intent(MusteriGiris.this,MainActivity.class);
                startActivity(geri_don);
            }
        });

        btn_mGiris2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_mGiris2 = new Intent(MusteriGiris.this,mKontrol.class);
                startActivity(btn_mGiris2);
            }
        });


    }
}