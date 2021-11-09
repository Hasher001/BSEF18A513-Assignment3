package com.example.makhrijal_urf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        TextView txt = (TextView) findViewById(R.id.score);
        txt.setText(intent.getStringExtra("value"));

    }


    public void back2_button(View v) {
        switch(v.getId()) {
            case R.id.back2:
                Intent intent =  new Intent(result.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

}