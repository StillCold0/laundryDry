package com.asrinhaktan.laundrydry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mKontrol2 extends AppCompatActivity {

    public TextView t_urunTipi;
    public Button btn_geridon5;
    public TextView t_fiyat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkontrol2);

        t_fiyat=(TextView)findViewById(R.id.fiyat);
        t_urunTipi=(TextView)findViewById(R.id.urunTipi);
        btn_geridon5=(Button)(findViewById(R.id.geri_don5));

        btn_geridon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_geridon5 = new Intent(mKontrol2.this,mKontrol.class);
                startActivity(btn_geridon5);
            }
        });



    }
}