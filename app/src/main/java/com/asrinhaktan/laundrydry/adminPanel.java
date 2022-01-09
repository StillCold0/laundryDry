package com.asrinhaktan.laundrydry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adminPanel extends AppCompatActivity {
    public Button btn_mOlustur;
    public Button btn_mKontrol;
    public Button btn_geridon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);


        btn_mOlustur=findViewById(R.id.mOlustur);
        btn_mKontrol=findViewById(R.id.mKontrol);
        btn_geridon2=findViewById(R.id.geri_don2);

        btn_geridon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_geridon2 = new Intent(adminPanel.this,MainActivity.class);
                startActivity(btn_geridon2);
            }
        });
        btn_mKontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_mKontrol = new Intent(adminPanel.this, mKontrol.class);
                startActivity(btn_mKontrol);
            }
        });

        btn_mOlustur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_mOlustur = new Intent(adminPanel.this,yeniMusteri.class);
                startActivity(btn_mOlustur);
            }
        });






    }
}