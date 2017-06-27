package com.example.marvi.devthis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Role extends AppCompatActivity {
    private String currentRole;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        Intent intent = getIntent();
        String[] roles = intent.getStringArrayExtra("roles");
        String role = intent.getExtras().getString("role");

        setRole(roles, role);
    }

    public void setRole(String[] roles, String role) {
        final TextView yourRole = (TextView) findViewById(R.id.yourRole);
        final TextView category = (TextView) findViewById(R.id.Category);

        this.currentRole = role;

        String randomRole = roles[new Random().nextInt(roles.length)];

        yourRole.setText(randomRole);
        category.setText(role);
    }

    public void playSound(View v) {
        final String currentRole = this.currentRole;

        if (currentRole.equals("Reanimation")) {
              this.mp = MediaPlayer.create(this, R.raw.reanimation);
        } else if (currentRole.equals("Fire")) {
              this.mp = MediaPlayer.create(this, R.raw.fire);
        } else {
              this.mp = MediaPlayer.create(this, R.raw.evacuation);
        }

        mp.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (this.mp != null) {
            this.mp.pause();
            if (isFinishing()) {
                this.mp.stop();
                this.mp.release();
            }
        }
    }
}
