package com.asrinhaktan.laundrydry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {


    public static String ip = "10.51.34.46";
    public static String port = "1433";
    public static String classes = "net.sourceforge.jtds.jdbc.Driver";


    //tanımlanan buton ve textler
    public EditText edit_pWD;
    public EditText edit_pID;
    public Button btn_mGiris;
    public Button btn_pGiris;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.INTERNET}, PackageManager.PERMISSION_GRANTED);


        edit_pWD = (EditText)findViewById(R.id.pPWD);
        edit_pID = (EditText)findViewById(R.id.pID);
        btn_pGiris = (Button)findViewById(R.id.pGiris);
        btn_mGiris = (Button)findViewById(R.id.mGiris1);



        /////////////////////////////////////////////////////////////////////
        btn_pGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pGiris = new Intent(MainActivity.this,adminPanel.class);
                startActivity(pGiris);
            }
        });

        btn_mGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mGiris = new Intent(MainActivity.this,MusteriGiris.class);
                startActivity(mGiris);
            }
        });










    }








    }
