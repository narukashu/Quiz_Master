package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit_answer(View view) {
        int score = answers();
        String total = String.valueOf(score);
        Toast.makeText(this, "Your Total Score is " + total + " Out of 7!", Toast.LENGTH_SHORT).show();
    }


    public int answers() {
        RadioGroup rg;
        int q1ans = R.id.radioAnsOne;
        int q2ans = R.id.radioAnsTwo;
        int q3ans = R.id.radioAnsThree;
        int q4ans = R.id.radioAnsFour;
        int q5ans = R.id.radioAnsFive;
        int Points = 0;
        rg = (RadioGroup) findViewById(R.id.radioGroupOne);
        int value = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupTwo);
        int value2 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupThree);
        int value3 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupFour);
        int value4 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupFive);
        int value5 = rg.getCheckedRadioButtonId();
        CheckBox carbohydrateCheckbox1 = (CheckBox) findViewById(R.id.checkAns1);
        boolean check1 = carbohydrateCheckbox1.isChecked();
        CheckBox carbohydrateCheckbox2 = (CheckBox) findViewById(R.id.checkAns2);
        boolean check2 = carbohydrateCheckbox2.isChecked();
        CheckBox carbohydrateCheckbox3 = (CheckBox) findViewById(R.id.checkAns3);
        boolean check3 = carbohydrateCheckbox3.isChecked();
        CheckBox carbohydrateCheckbox4 = (CheckBox) findViewById(R.id.checkAns4);
        boolean check4 = carbohydrateCheckbox4.isChecked();
        EditText checkans7 = (EditText) findViewById(R.id.checkAns7);
        String answer7 = checkans7.getText().toString();

        if (q1ans == value) {
            Points += 1;
        }
        if (q2ans == value2) {
            Points += 1;
        }
        if (q3ans == value3) {
            Points +=  1;
        }
        if (q4ans == value4) {
            Points += 1;
        }
        if (q5ans == value5) {
            Points +=  + 1;
        }
        if (check1 == check2 == check3 == true && check4 == false) {
            Points += 1;
        }
        if (answer7.equalsIgnoreCase("Energy")) {
            Points += 1;
        }
        return Points;
    }

}