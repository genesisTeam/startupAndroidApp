package com.genesisteam.apps.startupapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aaron on 12/29/2015.
 */
public class ChecklistAdapter extends ArrayAdapter<String> {

    public ChecklistAdapter(Context context, int resource, String[] lessons) {
        super(context, resource, lessons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if(rowView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            rowView = layoutInflater.inflate(R.layout.row_checklist, null);
        }

        String lessonTitle = getItem(position);

        Resources res = getContext().getResources();
        if(position % 2 == 0) {
            rowView.setBackgroundColor(res.getColor(R.color.lightGray));
        } else {
            rowView.setBackgroundColor(res.getColor(R.color.darkGray));
        }

        TextView lessonText = (TextView) rowView.findViewById(R.id.lesson_name);
        lessonText.setText(lessonTitle);

        return rowView;
    }

}