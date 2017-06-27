package com.example.marvi.devthis;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginButtonOnClick(View v) {
        final EditText usernameText = (EditText)findViewById(R.id.EditUsername);
        final String username = usernameText.getText().toString();

        final EditText passwordText = (EditText)findViewById(R.id.EditPassword);
        final String password = passwordText.getText().toString();

        if (password.equals("Marvin") && username.equals("Marvin")) {
            Intent intent = new Intent(this, Category.class);
            startActivity(intent);
        } else {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Wrong information", duration).show();
        }
    }

    public void registerButtonOnClick(View v) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
