package com.asrinhaktan.laundrydry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class yeniMusteri extends AppCompatActivity {


    public CheckBox c_gunlukYikama;
    public CheckBox c_uzunYikama;
    public CheckBox c_tamiratOlustur;
    public EditText e_kiyafetTipi;
    public EditText e_musteriID;
    public EditText e_kiyafetAgirligi;
    public EditText e_AlinanTarih;
    public Button btn_mOlustur;
    public Button btn_geridon3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeni_musteri);

        //tanımlananlar
        c_gunlukYikama=(CheckBox)findViewById(R.id.gunlukYikama);
        c_uzunYikama=(CheckBox)findViewById(R.id.uzunYikama);
        c_tamiratOlustur=(CheckBox)findViewById(R.id.tamiratOlustur);
        e_kiyafetTipi=(EditText)findViewById(R.id.kiyafetTipi);
        e_kiyafetAgirligi=(EditText)findViewById(R.id.kiyafetAgirligi);
        e_musteriID = (EditText)findViewById(R.id.musteriID);
        e_AlinanTarih=(EditText)findViewById(R.id.alinanTarih);
        btn_geridon3=(Button)findViewById(R.id.geri_don3);
        btn_mOlustur=(Button)findViewById(R.id.kiyafetOlustur);

        btn_geridon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_geridon3 = new Intent(yeniMusteri.this,adminPanel.class);
                startActivity(btn_geridon3);
            }
        });

        btn_mOlustur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Yeni ürün oluşturuldu!",Toast.LENGTH_SHORT).show();
            }
        });



    }
}