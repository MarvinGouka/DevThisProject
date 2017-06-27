package com.example.marvi.devthis;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void registerButtonOnClick(View v) {
        final EditText usernameText = (EditText)findViewById(R.id.EditUsername);
        final String username = usernameText.getText().toString();

        final EditText passwordText = (EditText)findViewById(R.id.EditPassword);
        final String password = passwordText.getText().toString();

        Intent intent = new Intent(this, Category.class);
        startActivity(intent);
    }
}
