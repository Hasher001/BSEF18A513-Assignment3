package com.example.makhrijal_urf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;
import java.util.*;
import java.io.*;

public class quiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        //Creating arrays for different portions of questions
        String[] Arr1={"Sound Produced from End of Throat ?","Sound Produced from Middle of Throat ?","Sound Produced from Start of the Throat ?"};
        String[] Arr2={"Sound Produced from Base of Tongue which is near Uvula touching the mouth roof ?","Sound Produced from Portion of Tongue near its base touching the roof of mouth?"};
        String[] Arr3={"Sound Produced from Tongue touching the center of the mouth roof ?","Sound Produced from One side of the tongue touching the molar teeth ?"};


        //Generating random numbers to shuffle questions each time
        View st1 = (TextView)findViewById(R.id.statement1);
        Random random = new Random();
        int value1 = random.nextInt(3 + 0) + 0;

        //setting text value to randomly generated question
        ((TextView) st1).setText(Arr1[value1]);


        View st2 = findViewById(R.id.statement2);
        View st3 = findViewById(R.id.statement3);



    }

    public void back_button(View v) {
        switch(v.getId()) {
            case R.id.Back:
                Intent intent =  new Intent(quiz.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    public void submit_button(View v) {
        switch(v.getId()) {
            case R.id.submit:
                Intent intent =  new Intent(quiz.this, result.class);
                startActivity(intent);
                break;
        }
    }

}