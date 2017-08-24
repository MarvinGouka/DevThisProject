package com.example.marvi.devthis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void reanimationButtonClick(View v) {
        Intent intent = new Intent(this, Role.class);

        String[] roleArray = new String[] {"Hart massage", "Ademhalen", "Omgeving veilig maken"};
        String role = "Reanimatie";

        intent.putExtra("roles", roleArray);
        intent.putExtra("role", role);

        startActivity(intent);
    }

    public void fireButtonClick(View v) {
        Intent intent = new Intent(this, Role.class);

        String[] roleArray = new String[] {"Brand Blussen", "Bekijk brand status", "Evacueren"};
        String role = "Brand";

        intent.putExtra("roles", roleArray);
        intent.putExtra("role", role);

        startActivity(intent);
    }

    public void evacuationButtonClick(View v) {
        Intent intent = new Intent(this, Role.class);

        String[] roleArray = new String[] {"Wijs uitgangen aan", "Informeer mensen", "Begeleid mensen naar buiten"};
        String role = "Evacuatie";

        intent.putExtra("roles", roleArray);
        intent.putExtra("role", role);

        startActivity(intent);
    }

    public void mapButtonClick(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void bhvButtonClick(View v) {
        Intent intent = new Intent(this, bhv.class);
        startActivity(intent);
    }

    public void optionsButtonClick(View v) {
        Intent intent = new Intent(this, Option.class);
        startActivity(intent);
    }
}
