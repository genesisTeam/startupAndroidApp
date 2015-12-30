package com.genesisteam.apps.startupapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;


public class ChecklistFragment extends ListFragment {

    public ChecklistFragment() {
        // Required empty public constructor
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent lessonIntent = new Intent(getActivity(), LessonActivity.class);
        startActivity(lessonIntent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ListAdapter checklistAdapter = new ChecklistAdapter(getActivity(), R.layout.row_checklist, new String[] {"Lesson 1", "Lesson 2"});
        setListAdapter(checklistAdapter);
        return inflater.inflate(R.layout.fragment_checklist, container, false);
    }
}
