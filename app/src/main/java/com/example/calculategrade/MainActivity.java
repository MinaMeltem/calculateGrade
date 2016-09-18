package com.example.calculategrade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText gradeInput;
    private Button submitButton;
    private TextView gradeDisplay;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gradeInput = (EditText) findViewById(R.id.et_grade_input);
        gradeDisplay =(TextView)findViewById(R.id.tv_letter_grade) ;
        submitButton = (Button) findViewById(R.id.button_submit);
        submitButton.setOnClickListener( new View.OnClickListener() {


            public void onClick(View v) {
                String inputGrade = gradeInput.getText().toString();
                String grade = calculation(Integer.parseInt(inputGrade)); // Since return string end of the method, canvert it to int first
                gradeDisplay.setText(grade);
            }

        } );

    }


    public String calculation(int inputGrade) {

        String grade = "!";

        if (inputGrade >= 0 && inputGrade <= 59)

        {
            grade = "F";
        }
        else if (inputGrade >= 60 && inputGrade <= 69)

        {
            grade = "D";
        }
        else if (inputGrade >= 70 && inputGrade <= 79)

        {
            grade = "C";
        }
        else if (inputGrade >= 80 && inputGrade <= 89)

        {
            grade = "B";
        }
        else if (inputGrade >= 90 && inputGrade <= 99)

        {
            grade = "A";
        }
        else if (inputGrade == 100)

        {
            grade = "A+";
        }

        return grade;

    }
}
