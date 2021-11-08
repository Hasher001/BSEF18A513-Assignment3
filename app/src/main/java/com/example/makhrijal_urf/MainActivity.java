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

    public void valid_button(View v) {
        switch(v.getId()) {
            case R.id.Validation:
                Intent intent =  new Intent(MainActivity.this, validation.class);
                startActivity(intent);
                break;
        }
    }

    public void quiz_button(View v) {
        switch(v.getId()) {
            case R.id.Quiz:
                Intent intent =  new Intent(MainActivity.this, quiz.class);
                startActivity(intent);
                break;
        }
    }


}