package com.example.marvi.devthis;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        Intent intent = getIntent();
        String role = intent.getExtras().getString("role");

        setRoleTutorial(role);
    }

    public void setRoleTutorial(String role) {
        VideoView view = (VideoView)findViewById(R.id.videoView);
        String path = "";

        if (role.equals("Reanimatie")) {
             path = "android.resource://" + getPackageName() + "/" + R.raw.reanimatie_video;
        } else if (role.equals("Brand")) {
             path = "android.resource://" + getPackageName() + "/" + R.raw.brand_video;
        } else {
             path = "android.resource://" + getPackageName() + "/" + R.raw.evacuatie_video;
        }

        view.setVideoURI(Uri.parse(path));
        view.start();
    }
}
