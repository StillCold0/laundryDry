package com.asrinhaktan.laundrydry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mKontrol extends AppCompatActivity {

    public EditText e_musteriID;
    public Button btn_geridon4;
    public Button btn_mKontrol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkontrol);
        e_musteriID = (EditText)findViewById(R.id.musteriID);
        btn_geridon4 = (Button)findViewById(R.id.geri_don4);
        btn_mKontrol = (Button)findViewById(R.id.mKontrol);


        btn_geridon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_geridon4 = new Intent(mKontrol.this,MainActivity.class);
                startActivity(btn_geridon4);
            }
        });

        btn_mKontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_mKontrol = new Intent(mKontrol.this,mKontrol2.class);
                startActivity(btn_mKontrol);
            }
        });
    }
}