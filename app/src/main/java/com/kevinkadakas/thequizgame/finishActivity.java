package com.kevinkadakas.thequizgame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finishActivity extends Activity {

    TextView finalPoints, tulemus;
    Button finish;

    public int praegusedPunktid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        finalPoints = findViewById(R.id.finalPoints);
        tulemus = findViewById(R.id.tulemus);
        finish = findViewById(R.id.button2);

        Intent intent = getIntent();
        praegusedPunktid = intent.getIntExtra("punktid2", 0);

        if (praegusedPunktid < 0) {
            finalPoints.setTextColor(Color.parseColor("#973434"));
            tulemus.setText("Sa ei tea mind üldse");
        } else if (praegusedPunktid < 3 && praegusedPunktid >= 0) {
            finalPoints.setTextColor(Color.parseColor("#009e12"));
            tulemus.setText("Vedas.");
        } else if (praegusedPunktid == 3) {
            finalPoints.setTextColor(Color.parseColor("#009e12"));
            tulemus.setText("Wow!");
        }

        finalPoints.setText(String.valueOf(praegusedPunktid));

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(finishActivity.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });

    }
}
