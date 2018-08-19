package com.bitbyte24seven.quizapp;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
    EditText qu6primeMin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qu6primeMin = findViewById(R.id.qu6primeMin);

    }
    public void btnprime(View view) {
        String message = qu6primeMin.getText().toString();

        String primeMisterName = "Narendra Modi";

        if (primeMisterName == message){
            rightAlert();
        }
        else
            wrongAlert();
    }

    public void onCheckboxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        boolean checked = checkBox.isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.qu5Larry:
                if (checked)
                    rightAlert();
                else
                    Toast.makeText(this, "Something ia missing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.qu5Sergey:
                if (checked)
                    rightAlert();
                break;

            case R.id.qu5Eduar:
                if (checked)
                    wrongAlert();
                break;


        }

    }

    public void onRadioqu1Clicked(View view) {
        // Is the button now checked?
        boolean radioBUtton = ((RadioButton) view).isChecked();


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.qu1True:
                wrongAlert();
                break;
            case R.id.qu1Maybe:
                wrongAlert();
                break;
            case R.id.qu1False:
                score += 1;
                Toast.makeText(this, "That is Right Answer", Toast.LENGTH_LONG).show();
                rightAlert();
                break;

        }

    }

    public void onRadioqu2Clicked(View view) {
        switch (view.getId()) {
            case R.id.qu2True:
                wrongAlert();
                break;
            case R.id.qu2Maybe:
                wrongAlert();
                break;
            case R.id.qu2False:
                score += 1;
                Toast.makeText(this, "That is Right Answer", Toast.LENGTH_LONG).show();
                rightAlert();
                break;

        }
    }

    public void onRadioqu3Clicked(View view) {
        switch (view.getId()) {
            case R.id.qu3True:
                wrongAlert();
                break;
            case R.id.qu3Maybe:
                wrongAlert();
                break;
            case R.id.qu3False:
                score += 1;
                Toast.makeText(this, "That is Right Answer", Toast.LENGTH_LONG).show();
                rightAlert();
                break;

        }
    }

    public void rightAlert() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
//        builder1.setMessage("");
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


    public void wrongAlert() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        //  builder1.setMessage("");
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


}



