package com.example.android.testyourbrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.testyourbrain.R;

public class MainActivity extends AppCompatActivity {

    int score;
    int finalScore;
    boolean isQuestion1Correct;
    boolean isQuestion2Correct;
    boolean isQuestion3Correct;
    boolean isQuestion4Correct;
    boolean isQuestion5Correct;
    boolean isQuestion6Correct;
    boolean isQuestion7Correct;
    boolean isQuestion8Correct;
    boolean isQuestion9Correct;
    boolean isQuestion10Correct;
    boolean isQuestion11Correct;
    boolean isQuestion12Correct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    /**
     * This method is called when the submit responses button is clicked
     */
    public void submitButton(View view) {
        evaluateQuestion1();
        evaluateQuestion2();
        evaluateQuestion3();
        evaluateQuestion4();
        evaluateQuestion5();
        evaluateQuestion6();
        evaluateQuestion7();
        evaluateQuestion8();
        evaluateQuestion9();
        evaluateQuestion10();
        evaluateQuestion11();
        evaluateQuestion12();
        Toast.makeText(this, "You scored " + score + " points out of 12!", Toast.LENGTH_LONG).show();
        finalScore = score;
        score = 0;
    }

    /**
     * This method evaluates the response  given in question 1
     */
    public void evaluateQuestion1() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.chukwulobe_button);
        if (radioButton.isChecked()) {
            isQuestion1Correct = true;
            score = score + 1;
        } else {
            isQuestion1Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 2
     */
    public void evaluateQuestion2() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.russia_button);
        if (radioButton.isChecked()) {
            isQuestion2Correct = true;
            score = score + 1;
        } else {
            isQuestion2Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 3
     */
    public void evaluateQuestion3() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.musa_button);
        if (radioButton.isChecked()) {
            isQuestion3Correct = true;
            score = score + 1;
        } else {
            isQuestion3Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 4
     */
    public void evaluateQuestion4() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.ronaldo_button);
        if (radioButton.isChecked()) {
            isQuestion4Correct = true;
            score = score + 1;
        } else {
            isQuestion4Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 5
     */
    public void evaluateQuestion5() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.uruguay_button);
        if (radioButton.isChecked()) {
            isQuestion5Correct = true;
            score = score + 1;
        } else {
            isQuestion5Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 6
     */
    public void evaluateQuestion6() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.science_button);
        if (radioButton.isChecked()) {
            isQuestion6Correct = true;
            score = score + 1;
        } else {
            isQuestion6Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 7
     */
    public void evaluateQuestion7() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.charge_button);
        if (radioButton.isChecked()) {
            isQuestion7Correct = true;
            score = score + 1;
        } else {
            isQuestion7Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 8
     */
    public void evaluateQuestion8() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.hectres_button);
        if (radioButton.isChecked()) {
            isQuestion8Correct = true;
            score = score + 1;
        } else {
            isQuestion8Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 9
     */
    public void evaluateQuestion9() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.football_button);
        if (radioButton.isChecked()) {
            isQuestion9Correct = true;
            score = score + 1;
        } else {
            isQuestion9Correct = false;
        }
    }

    /**
     * This method evaluates the response  given in question 10
     */
    public void evaluateQuestion10() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.chinyere_button);
        if (radioButton.isChecked()) {
            isQuestion10Correct = true;
            score = score + 1;
        } else {
            isQuestion10Correct = false;
        }
    }

    /**
     * This method evaluates the response given in question 11
     */
    public void evaluateQuestion11(){
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String question11Response = editText.getText().toString();
        if (question11Response.equals("Emmanuel")){
            isQuestion11Correct = true;
            score = score + 1;
        }else{
            isQuestion11Correct = false;
        }
    }

    /**
     * This method evaluates the responses given in question 12
     */
    public void evaluateQuestion12(){
        CheckBox checkBoxMessi = (CheckBox) findViewById(R.id.messi_box);//right answer
        CheckBox checkBoxRooney = (CheckBox) findViewById(R.id.rooney_box);//right answer
        CheckBox checkBoxCharlie = (CheckBox) findViewById(R.id.charlie_box);
        CheckBox checkBoxJohn = (CheckBox) findViewById(R.id.john_box);

        boolean right=checkBoxMessi.isChecked() && checkBoxRooney.isChecked();
        boolean wrong=checkBoxCharlie.isChecked() && checkBoxJohn.isChecked();

        if(right && !wrong ){
            isQuestion12Correct = true;
            score = score + 1;
        }else{
            isQuestion12Correct = false;
        }
    }
}

