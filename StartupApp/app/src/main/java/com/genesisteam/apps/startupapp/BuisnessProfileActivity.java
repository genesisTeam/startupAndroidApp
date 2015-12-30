package com.genesisteam.apps.startupapp;

import android.content.Context;
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
import android.widget.ImageView;

/**
 * Created by Tim A on 12/30/2015.
 */
public class BuisnessProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buisness_profile);
        String title = "PROFILE";
        setupActionBar(title);


//        final ImageView nextProf = (ImageView) findViewById(R.id.imageButton);
//        nextProf.setOnClickListener(new View.OnClickListener()
//
//                                    {
//                                        @Override
//                                        public void onClick(View v) {
//
//
//                                        }
//                                    }
//
//        );
//        nextProf.setOnTouchListener(new View.OnTouchListener()
//
//                                {
//                                    @Override
//                                                                         public boolean onTouch(View v, MotionEvent event) {
//                                            if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                                                nextProf.setImageResource(R.drawable.button_next_clicked);
//                                            }
//                                            if (event.getAction() == MotionEvent.ACTION_UP) {
//                                                nextProf.setImageResource(R.drawable.button_next);
//                                            }
//                                            return false;
//                                        }
//                                }
//
//        );


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
