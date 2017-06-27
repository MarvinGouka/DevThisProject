package com.example.marvi.devthis;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class Option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        checkPreferences();
        checkPreferences2();
        checkPreferences3();
    }

    public void toggleButtonClick(View v) {
        final ToggleButton tg = (ToggleButton) findViewById(R.id.toggleButton1);

        SharedPreferences.Editor editor = getSharedPreferences("TG", MODE_PRIVATE).edit();

        if(tg.isChecked())
        {
            editor.putBoolean("tgpref", true); // value to store
            editor.commit();
        }
        else
        {
            editor.putBoolean("tgpref", false); // value to store
            editor.commit();
        }
    }

    public void checkPreferences() {
        SharedPreferences prefs = getSharedPreferences("TG", MODE_PRIVATE);
        boolean preferences = prefs.getBoolean("tgpref", true);
        final ToggleButton tg = (ToggleButton) findViewById(R.id.toggleButton1);


        if (preferences)
        {
            tg.setChecked(true);
        }
        else
        {
            tg.setChecked(false);
        }
    }

    public void toggleButtonClick2(View v) {
        final ToggleButton tg = (ToggleButton) findViewById(R.id.toggleButton2);

        SharedPreferences.Editor editor = getSharedPreferences("TG2", MODE_PRIVATE).edit();

        if(tg.isChecked())
        {
            editor.putBoolean("tgpref2", true); // value to store
            editor.commit();
        }
        else
        {
            editor.putBoolean("tgpref2", false); // value to store
            editor.commit();
        }
    }

    public void checkPreferences2() {
        SharedPreferences prefs = getSharedPreferences("TG2", MODE_PRIVATE);
        boolean preferences = prefs.getBoolean("tgpref2", true);
        final ToggleButton tg = (ToggleButton) findViewById(R.id.toggleButton2);


        if (preferences)
        {
            tg.setChecked(true);
        }
        else
        {
            tg.setChecked(false);
        }
    }

    public void toggleButtonClick3(View v) {
        final ToggleButton tg = (ToggleButton) findViewById(R.id.toggleButton3);

        SharedPreferences.Editor editor = getSharedPreferences("TG3", MODE_PRIVATE).edit();

        if(tg.isChecked())
        {
            editor.putBoolean("tgpref3", true); // value to store
            editor.commit();
        }
        else
        {
            editor.putBoolean("tgpref3", false); // value to store
            editor.commit();
        }
    }

    public void checkPreferences3() {
        SharedPreferences prefs = getSharedPreferences("TG3", MODE_PRIVATE);
        boolean preferences = prefs.getBoolean("tgpref3", true);
        final ToggleButton tg = (ToggleButton) findViewById(R.id.toggleButton3);


        if (preferences)
        {
            tg.setChecked(true);
        }
        else
        {
            tg.setChecked(false);
        }
    }

}
