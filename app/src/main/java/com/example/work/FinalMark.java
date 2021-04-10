package com.example.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalMark extends AppCompatActivity {

    int result1,result2,result3,result4,result5, finalresult;
    TextView outputTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_mark);
        Intent myGetIntent=getIntent();
        result1=myGetIntent.getIntExtra(Radio.quizmarks,0);
        result2=myGetIntent.getIntExtra(Radio2.quizmarks,0);
        result3=myGetIntent.getIntExtra(Radiio3.quizmarks,0);
        result4=myGetIntent.getIntExtra(Radio4.quizmarks,0);
        result5=myGetIntent.getIntExtra(Radio5.quizmarks,0);
        finalresult=result1+result2+result3+result4+result5;
        outputTextview=findViewById(R.id.outputTextviewID);

        if (finalresult==25){
            outputTextview.setText("Your answer is correct ans marks is 25");
        }
        else{
            outputTextview.setText("Your answer is wrong ans mark is 0");
        }
    }
    public void TryagainFunction(View view){
        Intent myfirstIntent=new Intent(FinalMark.this,MainActivity.class);
        startActivity(myfirstIntent);
    }
}
