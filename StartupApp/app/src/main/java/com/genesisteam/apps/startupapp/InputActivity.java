package com.genesisteam.apps.startupapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        String title = "LESSON 1 Feedback";
        setupActionBar(title);
        final Intent inputIntent = new Intent(this, CompletedActivity.class);

        final ImageButton submit = (ImageButton) findViewById(R.id.button_input_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(inputIntent);
            }
        });
        submit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    submit.setImageResource(R.drawable.submit_button_clicked);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    submit.setImageResource(R.drawable.submit_button);
                }
                return false;
            }
        });

    }

    private void setupActionBar(String title) {
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle(title);
        LayoutInflater inflator = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.action_bar_logo, null);
        ActionBar.LayoutParams lp = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER
        );
        ab.setCustomView(v, lp);
        ab.setDisplayShowCustomEnabled(true);
        ab.setDisplayShowTitleEnabled(true);
    }
}
