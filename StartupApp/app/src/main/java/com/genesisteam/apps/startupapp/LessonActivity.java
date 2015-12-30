package com.genesisteam.apps.startupapp;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.v7.app.ActionBar.LayoutParams;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        String title = "LESSON 1";
        setupActionBar(title);
        final Intent inputIntent = new Intent(this, InputActivity.class);

        final ImageButton next = (ImageButton) findViewById(R.id.button_lesson_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(inputIntent);
            }
        });
        next.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    next.setImageResource(R.drawable.button_next_clicked);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    next.setImageResource(R.drawable.button_next);
                }
                return false;
            }
        });

        String text = "<p>Remember, because God has made us managers over His creation, we are responsible to care for everything that He has given to us. The Bible directs us to plan for our businesses, including our production.</p> " +
                "<p>Consider this proverb:</p>" +
                "<p>“If you plan and work hard, you will have plenty; if you get in a hurry, you will end up poor.”</p>" +
                "<p><b>What do you hear from this proverb?</b></p>" +
                "<p><b>What local proverbs do you know about hard work and planning?</b></p>" +
                "<p>An important step in planning a good business is to think about production. Production is the combination of materials, labor and tools to make a product you want to sell.</p> " +
                "<p>For example, to sell samosas, what do you need?</p>" +
                "<p>Basically, there are 5 components of production for any product:</p>" +
                "<p>1. Labor—people to make something, to transport it, to sell it, etc.</p>" +
                "<p>2. Materials and Supplies—things like flour, wood, cotton, bamboo, leather, etc.</p>" +
                "<p>3. Equipment—tools, sewing machine, carving knives, scissors, pots, stove, oven, etc.</p> " +
                "<p>4. Work Area—a place to make your product</p>" +
                "<p>5. Production process—how all the other components fit together</p>" +
                "<p>A good manager carefully plans her production in order to make it better. When we do our best to plan our production, God is honored.</p>";
        TextView lessonText = (TextView) findViewById(R.id.lesson_text);
        lessonText.setText(Html.fromHtml(text));
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
        LayoutParams lp = new LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                Gravity.CENTER
        );
        ab.setCustomView(v, lp);
        ab.setDisplayShowCustomEnabled(true);
        ab.setDisplayShowTitleEnabled(true);
    }

}
