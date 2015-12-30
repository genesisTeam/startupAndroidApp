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
import android.widget.Toast;

public class MessageBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_board);

        String title = "Categories";
        setupActionBar(title);
        final Intent postIntent = new Intent(this, BoardPostsActivity.class);
        final Toast toast = Toast.makeText(this, "Sorry, feature not implemented yet.", Toast.LENGTH_SHORT);

        final ImageButton cat1 = (ImageButton) findViewById(R.id.cat1);
        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(postIntent);
            }
        });
        cat1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    cat1.setImageResource(R.drawable.getting_started_clicked);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    cat1.setImageResource(R.drawable.getting_started);
                }
                return false;
            }
        });

        final ImageButton cat2 = (ImageButton) findViewById(R.id.cat2);
        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });


        final ImageButton cat3 = (ImageButton) findViewById(R.id.cat3);
        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
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
