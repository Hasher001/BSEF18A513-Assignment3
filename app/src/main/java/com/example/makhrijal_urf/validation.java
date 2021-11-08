package com.example.makhrijal_urf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class validation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
    }
    public void openWebPage(View v) {
           Uri webpage = Uri.parse("https://github.com/Hasher001/BSEF18A513-Assignment3");
           Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
           startActivity(intent);
    }



}