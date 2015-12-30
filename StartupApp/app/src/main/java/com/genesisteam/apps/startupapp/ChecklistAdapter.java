package com.genesisteam.apps.startupapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aaron on 12/29/2015.
 */
public class ChecklistAdapter extends ArrayAdapter<ChecklistHeader> {

    public ChecklistAdapter(Context context, int resource, List<ChecklistHeader> lessons) {
        super(context, resource, lessons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if(rowView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            rowView = layoutInflater.inflate(R.layout.row_checklist, null);
        }

        ChecklistHeader header = getItem(position);

        TextView lessonText = (TextView) rowView.findViewById(R.id.lesson_name);
        lessonText.setText(header.getTitle());
        ImageView image = (ImageView) rowView.findViewById(R.id.complete_image);

        Resources res = getContext().getResources();
        image.setVisibility(View.INVISIBLE);
        if(header.isSection()) {
            rowView.setBackgroundColor(res.getColor(R.color.lightGray));
            lessonText.setTextSize(20);
//            image.setVisibility(View.INVISIBLE);
        } else {
            rowView.setBackgroundColor(res.getColor(R.color.darkGray));
            lessonText.setTextSize(16);
//            String imageString = "";
//            if(header.isComplete()) {
//                imageString += "Green";
//            } else if(header.isCurrent()) {
//                imageString += "White";
//                rowView.setBackgroundColor(res.getColor(R.color.colorPrimary));
//            } else {
//                imageString += "Gray";
//            }
//
//            imageString += Integer.toString(getNum(position));
//            image.setImageResource(R.drawable.gray4);
        }



        return rowView;
    }

    private int getNum(int position) {
        if(position <= 2) {
            return position - 1;
        } else if(position <=8) {
            return position - 2;
        }

        return position - 3;
    }

}