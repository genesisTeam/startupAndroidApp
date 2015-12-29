package com.genesisteam.apps.startupapp;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        setupActionBar();

    }

    private void setupActionBar() {
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayShowCustomEnabled(true);
        ab.setDisplayShowTitleEnabled(false);
        //ab.setIcon(R.drawable.icon_white);
        LayoutInflater inflator = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.action_bar_logo, null);

//        TextView titleTV = (TextView) v.findViewById(R.id.title);
//        Typeface font = Typeface.createFromAsset(getAssets(),
//                "fonts/your_custom_font.ttf");
//        titleTV.setTypeface(font);

        ab.setCustomView(v);

        //ab.setHomeAsUpEnabled(true);
    }

}
