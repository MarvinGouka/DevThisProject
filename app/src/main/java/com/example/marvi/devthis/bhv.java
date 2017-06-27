package com.example.marvi.devthis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class bhv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhv);
    }

    public void callPersonClick(View v) {
        Intent intent = new Intent(this, calling.class);
        startActivity(intent);
    }
}
