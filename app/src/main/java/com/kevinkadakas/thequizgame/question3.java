package com.kevinkadakas.thequizgame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question3 extends Activity {

    Button w1, w2, w3, r1;
    TextView punktid, lisa;

    public int praegusedPunktid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        w1 = findViewById(R.id.wrong1);
        w2 = findViewById(R.id.wrong2);
        w3 = findViewById(R.id.wrong3);
        r1 = findViewById(R.id.right1);

        punktid = findViewById(R.id.points);
        lisa = findViewById(R.id.addPoints);

        Intent intent = getIntent();
        praegusedPunktid = intent.getIntExtra("punktid1", 0);

        punktid.setText(String.valueOf(praegusedPunktid));

        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w2.setEnabled(false);
                w3.setEnabled(false);
                r1.setEnabled(false);
                w1.setEnabled(false);
                praegusedPunktid = praegusedPunktid-2;
                punktid.setText(String.valueOf(praegusedPunktid));
                w1.setBackgroundResource(R.drawable.button_failed);
                lisa.setTextColor(Color.parseColor("#973434"));
                lisa.setText("-2");
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent nextActivity = new Intent(question3.this, finishActivity.class);
                        nextActivity.putExtra("punktid2", praegusedPunktid);
                        startActivity(nextActivity);
                        finish();
                    }
                },3000);
            }
        });

        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w2.setEnabled(false);
                w3.setEnabled(false);
                r1.setEnabled(false);
                w1.setEnabled(false);
                praegusedPunktid = praegusedPunktid-2;
                punktid.setText(String.valueOf(praegusedPunktid));
                w2.setBackgroundResource(R.drawable.button_failed);
                lisa.setTextColor(Color.parseColor("#973434"));
                lisa.setText("-2");
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent nextActivity = new Intent(question3.this, finishActivity.class);
                        nextActivity.putExtra("punktid2", praegusedPunktid);
                        startActivity(nextActivity);
                        finish();
                    }
                },3000);
            }
        });

        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w2.setEnabled(false);
                w3.setEnabled(false);
                r1.setEnabled(false);
                w1.setEnabled(false);
                praegusedPunktid = praegusedPunktid-2;
                punktid.setText(String.valueOf(praegusedPunktid));
                w3.setBackgroundResource(R.drawable.button_failed);
                lisa.setTextColor(Color.parseColor("#973434"));
                lisa.setText("-2");
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent nextActivity = new Intent(question3.this, finishActivity.class);
                        nextActivity.putExtra("punktid2", praegusedPunktid);
                        startActivity(nextActivity);
                        finish();
                    }
                },3000);
            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w2.setEnabled(false);
                w3.setEnabled(false);
                r1.setEnabled(false);
                w1.setEnabled(false);
                praegusedPunktid = praegusedPunktid+1;
                punktid.setText(String.valueOf(praegusedPunktid));
                r1.setBackgroundResource(R.drawable.button_true);
                lisa.setTextColor(Color.parseColor("#009e12"));
                lisa.setText("+1");
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent nextActivity = new Intent(question3.this, finishActivity.class);
                        nextActivity.putExtra("punktid2", praegusedPunktid);
                        startActivity(nextActivity);
                        finish();
                    }
                },3000);
            }
        });

    }
}