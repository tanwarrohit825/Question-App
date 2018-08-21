package com.bitbyte24seven.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;
    int totalqu;
    EditText qu6primeMin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qu6primeMin = findViewById(R.id.qu6primeMin);
    }

    // user click qu6
    //this method is called when Button is click
    public void btnprime(View view) {
        totalqu += 1;
        //user type message and  save to message variable
        String message = qu6primeMin.getText().toString();

        // check the user text is equal to our text
        if ("Narendra Modi".equals(message)) {
            // score increment by one
            score += 1;
            // set alert message user and user show giving right ans
            rightAlert();
        } else
            wrongAlert();
    }

    // user click qu5
    //when user check which box
    public void onCheckboxqu5Clicked(View view) {
        totalqu += 1;
        CheckBox checkBox = (CheckBox) view;
        boolean checked = checkBox.isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.qu5Larry:
                if (checked) {
                    // score increment by 1
                    score += 1;
                    // set alert message user and user show giving right ans
                    rightAlert();
                } else
                    Toast.makeText(this, "Something ia missing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.qu5Sergey:
                if (checked) {
                    //score increment by 1
                    score += 1;
                    // set alert message user and user show giving right ans
                    rightAlert();
                } else
                    Toast.makeText(this, "Something ia missing", Toast.LENGTH_SHORT).show();
                break;

            case R.id.qu5Eduar:
                if (checked)
                    // user click wrong checkBox
                    wrongAlert();
                break;


        }

    }

    public void onCheckboxqu4Clicked(View view) {
        totalqu += 1;
        CheckBox checkBox = (CheckBox) view;
        boolean checked = checkBox.isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.qu4Windows:
                if (checked) {
                    // score increment by 1
                    score += 1;
                    // set alert message user and user show giving right ans
                    rightAlert();
                } else
                    Toast.makeText(this, "Something ia missing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.qu4MacOs:
                if (checked) {
                    //score increment by 1
                    score += 1;
                    // set alert message user and user show giving right ans
                    rightAlert();
                } else
                    Toast.makeText(this, "Something ia missing", Toast.LENGTH_SHORT).show();
                break;

            case R.id.qu4Both:
                if (checked) {
                    //score increment by 1
                    score += 1;
                    // set alert message user and user show giving right ans
                    rightAlert();
                } else
                    Toast.makeText(this, "Something ia missing", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    //user click qu1 in this question and having RadioButton
    public void onRadioqu1Clicked(View view) {
        totalqu += 1;
        // Is the button now checked?
        boolean radioBUtton = ((RadioButton) view).isChecked();


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.qu1True:
                // set alert message user and user show giving wrong ans
                wrongAlert();
                break;
            case R.id.qu1Maybe:
                wrongAlert();
                break;
            case R.id.qu1False:
                // score increment by 1
                score += 1;
                // set Toast message user givng Right Answer
                Toast.makeText(this, "That is Right Answer", Toast.LENGTH_LONG).show();
                // set alert user giving Right Answer
                rightAlert();
                break;

        }

    }

    //user click qu2 in this question and having RadioButton
    public void onRadioqu2Clicked(View view) {
        totalqu += 1;
        switch (view.getId()) {
            case R.id.qu2True:
                // set alert message user and user show giving wrong ans
                wrongAlert();
                break;
            case R.id.qu2Maybe:
                wrongAlert();
                break;
            case R.id.qu2False:
                // score increment by 1
                score += 1;
                // set Toast message user givng Right Answer
                Toast.makeText(this, "That is Right Answer", Toast.LENGTH_LONG).show();
                // set alert user giving Right Answer
                rightAlert();
                break;

        }
    }

    //user click qu2 in this question and having RadioButton
    public void onRadioqu3Clicked(View view) {
        totalqu += 1;
        switch (view.getId()) {
            case R.id.qu3True:
                // set alert message user and user show giving wrong ans
                wrongAlert();
                break;
            case R.id.qu3Maybe:
                wrongAlert();
                break;
            case R.id.qu3False:
                // score increment by 1
                score += 1;
                // set Toast message user givng Right Answer
                Toast.makeText(this, "That is Right Answer", Toast.LENGTH_LONG).show();
                // set alert user giving Right Answer
                rightAlert();
                break;

        }
    }

    // these are the alert message when user click Right ANS
    public void rightAlert() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle(Html.fromHtml("<font color='#6eff27'>That the Right Ans</font>"));
        builder1.setIcon(R.drawable.code);
        builder1.setCancelable(true);


        builder1.setPositiveButton(
                "Try Next Qution",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        alert11.getWindow().setLayout(600, 400);
        alert11.show();
    }


    // these are the alert message when user click Wrong ANS
    public void wrongAlert() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle(Html.fromHtml("<font color='#ff2727'>That the Wrong Ans</font>"));
        builder1.setIcon(R.drawable.awasome);
        builder1.setCancelable(true);


        builder1.setNegativeButton(
                "Tryagain",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        alert11.getWindow().setLayout(600, 400);
        alert11.show();
    }

    // when user is not compleate all Question showing Alert Message
    public void CompleteAllQuestion() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle(Html.fromHtml("<font color='#6eff27'>Complete All Question</font>"));
        builder1.setIcon(R.drawable.code);
        builder1.setCancelable(true);


        builder1.setPositiveButton(
                "Try to Complete All Question",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        alert11.getWindow().setLayout(600, 400);
        alert11.show();
    }


    // At last the user Submit all ANS and get the total Score
    public void submitAllAns(View view) {
        if (totalqu >= 6) {


            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Your Total Score is " + score);
            builder1.setIcon(R.drawable.code);
            builder1.setCancelable(true);
            builder1.setPositiveButton(
                    "Share with your friend",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //Share Score with your friends by Send SMS
                            composeMmsMessage("I got " + score + " In this awasome game \n share your Score");
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        } else
            CompleteAllQuestion();
            Toast.makeText(this, "Compleate all Que", Toast.LENGTH_LONG).show();
    }

    // this method when call the user Compleate the game and Share Score with your friends
    public void composeMmsMessage(String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
        intent.putExtra("sms_body", message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}



