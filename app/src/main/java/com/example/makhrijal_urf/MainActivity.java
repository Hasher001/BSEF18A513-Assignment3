package com.example.makhrijal_urf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learn_button(View v) {
        switch(v.getId()) {
            case R.id.Learn:
                Intent intent =  new Intent(MainActivity.this, Learn.class);
                startActivity(intent);
                break;
        }
    }



}