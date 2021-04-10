package com.example.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Radio2 extends AppCompatActivity {



    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;
    public static String quizmarks="I'm from Bangladesh";
    int marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio2);
        myRadiogroup=findViewById(R.id.radioGroupID);
    }

    public void submitfunction(View view) {
        int radioButtonid=myRadiogroup.getCheckedRadioButtonId();
        selectedRadiobutton=findViewById(radioButtonid);
        selectedValue=selectedRadiobutton.getText().toString();
        if(selectedValue.equals("AVI")){
            marks=5;
        }
        Intent myIntent=new Intent(Radio2.this,Radiio3.class );
        myIntent.putExtra(quizmarks,marks);
        startActivity(myIntent);
    }

}