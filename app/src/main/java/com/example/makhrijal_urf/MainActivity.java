package com.example.makhrijal_urf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Learnn:
                Intent intent = new Intent(MainActivity.this, Learn.class);
                startActivity(intent);
                break;

            // Quiz Button
            case R.id.Quizz:
                Intent intent2 = new Intent(MainActivity.this, quiz.class);
                startActivity(intent2);
                break;


            case R.id.Validationn:
                Intent intent3 = new Intent(MainActivity.this, validation.class);
                startActivity(intent3);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }



    public boolean Learn_button(View v){
        switch(v.getId()) {
            case R.id.Learn:
                Intent intent =  new Intent(MainActivity.this, Learn.class);
                startActivity(intent);
                break;
        }
        return true;
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
