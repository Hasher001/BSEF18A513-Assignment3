package com.example.makhrijal_urf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import java.lang.*;
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


        //Generating random numbers to shuffle questions each time for MCQ1
        View st1 = (TextView)findViewById(R.id.statement1);
        Random random = new Random();
        int value1 = random.nextInt(3 + 0) + 0;
        setvalue1(value1);
        //setting text value to randomly generated question
        ((TextView) st1).setText(Arr1[getvalue1()]);


        //Generating random numbers to shuffle questions each time for MCQ2
        View st2 = (TextView)findViewById(R.id.statement2);
        Random random2 = new Random();
        int value2 = random2.nextInt(2 + 0) + 0;
        setvalue2(value2);
        //setting text value to randomly generated question
        ((TextView) st2).setText(Arr2[getvalue2()]);


        //Generating random numbers to shuffle questions each time for MCQ2
        View st3 = (TextView)findViewById(R.id.statement3);
        Random random3 = new Random();
        int value3 = random3.nextInt(2 + 0) + 0;
        setvalue3(value3);
        //setting text value to randomly generated question
        ((TextView) st3).setText(Arr3[getvalue3()]);



    }

    public int value1;
    public int value2;
    public int value3;

    public int op1;
    public int op2;
    public int op3;

    public void setvalue1(int a){
        value1=a;
    }
    public int getvalue1(){
        return value1;
    }



    public void setvalue2(int b){
        value2=b;
    }
    public int getvalue2(){
        return value2;
    }


    public void setvalue3(int c){
        value3=c;
    }
    public int getvalue3(){
        return value3;
    }



    public void setop1(int a){
        op1=a;
    }
    public int getop1(){
        return op1;
    }



    public void setop2(int b){
        op2=b;
    }
    public int getop2(){
        return op2;
    }



    public void setop3(int c){
        op3=c;
    }
    public int getop3(){
        return op3;
    }



    //choosing option code
    public void option_buttonClick(View v) {
        RadioButton Ra = findViewById(v.getId());

        if (Ra.getContentDescription().equals("1")) {
            setop1(1);
            setop2(1);
            setop3(1);
        } else if (Ra.getContentDescription().equals("2")) {
            setop1(2);
            setop2(2);
            setop3(2);
        } else if (Ra.getContentDescription().equals("3")) {
            setop1(3);
            setop2(3);
            setop3(3);
        } else {
            setop1(4);
            setop2(4);
            setop3(4);

        }


    }


    public void submit_button(View v) {
        switch (v.getId()) {
            case R.id.submit:
                Intent intent = new Intent(quiz.this, result.class);
                startActivity(intent);
                break;
        }


        int v1=getop1();
        int v2=getop2();
        int v3=getop3();
        //score calculation
        int score=0;

        //MCQ1
        if(getvalue1()==0 && v1==1){
            score++;
        }
        else if(getvalue1()==1 && v1==2){
            score++;
        }
        else if(getvalue1()==2 && v1==3){
            score++;
        }
        else
            score=score;


        //MCQ2
        if(getvalue2()==0 && v2==1){
            score++;
        }
        else if(getvalue2()==1 && v2==2){
            score++;
        }
        else if(getvalue2()==2 && v2==3){
            score++;
        }
        else
            score=score;


        //MCQ3
        if(getvalue3()==0 && v3==1){
            score++;
        }
        else if(getvalue3()==1 && v3==2){
            score++;
        }
        else if(getvalue3()==2 && v3==3){
            score++;
        }
        else
            score=score;



        String result=Integer.toString(score);


//passing values of score
       Intent intent = new Intent(quiz.this, result.class);
        intent.putExtra("value", result);
        startActivity(intent);





    }



    public void back_button(View v) {
        switch(v.getId()) {
            case R.id.Back:
                Intent intent =  new Intent(quiz.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }






}