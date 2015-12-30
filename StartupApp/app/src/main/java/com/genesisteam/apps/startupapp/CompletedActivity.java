package com.genesisteam.apps.startupapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class CompletedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);

        String title = "LESSON 1 Feedback";
        setupActionBar(title);
        final Intent checklistIntent = new Intent(this, ChecklistActivity.class);
        final Intent messageBoardIntent = new Intent(this, MessageBoardActivity.class);
        final Toast toast = Toast.makeText(this, "Sorry, feature not implemented yet.", Toast.LENGTH_SHORT);


        final ImageButton msg = (ImageButton) findViewById(R.id.msg);
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(messageBoardIntent);
            }
        });
        msg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    msg.setImageResource(R.drawable.message_board_click);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    msg.setImageResource(R.drawable.message_board);
                }
                return false;
            }
        });

        final ImageButton share = (ImageButton) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });

        final ImageButton ret = (ImageButton) findViewById(R.id.return_lessons);
        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(checklistIntent);
            }
        });
        ret.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ret.setImageResource(R.drawable.return_to_lessons_clicked);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    ret.setImageResource(R.drawable.return_to_lessons);
                }
                return false;
            }
        });

    }

    public void goToProfile(View view) {
        Intent profileIntent = new Intent(this, ProfileActivity.class);
        startActivity(profileIntent);
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
