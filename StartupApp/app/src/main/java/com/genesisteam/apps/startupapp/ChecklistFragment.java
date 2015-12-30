package com.genesisteam.apps.startupapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


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
        ListAdapter checklistAdapter = new ChecklistAdapter(getActivity(), R.layout.row_checklist, createHeaderList());
        setListAdapter(checklistAdapter);
        return inflater.inflate(R.layout.fragment_checklist, container, false);
    }

    private List<ChecklistHeader> createHeaderList() {
        List<ChecklistHeader> headers = new ArrayList<>();
        headers.add(new ChecklistHeader("Introduction", true, true, false));
        headers.add(new ChecklistHeader("What Makes a Good Business", false, true, false));
        headers.add(new ChecklistHeader("Business Plan", true, false, false));
        headers.add(new ChecklistHeader("Talk With Customers to Test Idea", false, true, false));
        headers.add(new ChecklistHeader("Plan Your Production", false, false, true));
        headers.add(new ChecklistHeader("Plan Your Business Costs", false, false, false));
        headers.add(new ChecklistHeader("Find Help for Your Business", false, false, false));
        headers.add(new ChecklistHeader("Prepare for Unexpected Events", false, false, false));
        headers.add(new ChecklistHeader("Getting Started", true, false, false));
        headers.add(new ChecklistHeader("Separate Business and Household Money", false, false, false));
        headers.add(new ChecklistHeader("Calculate Your Profit", false, false, false));
        headers.add(new ChecklistHeader("Invest in Your Business", false, false, false));
        headers.add(new ChecklistHeader("Using Profit for Business, Household Needs and Savings", false, false, false));
        headers.add(new ChecklistHeader("Use the Business Loan for Your Business", false, false, false));
        headers.add(new ChecklistHeader("Prevent Business Money", false, false, false));
        headers.add(new ChecklistHeader("Manage Credit Sales", false, false, false));
        headers.add(new ChecklistHeader("Growing Your Business", true, false, false));
        headers.add(new ChecklistHeader("Understand and Respond to Your Customers", false, false, false));
        headers.add(new ChecklistHeader("Add Value to Your Products or Services", false, false, false));
        headers.add(new ChecklistHeader("Seize Opportunities to Sell", false, false, false));
        headers.add(new ChecklistHeader("Sell Where Customers Buy the Most", false, false, false));
        headers.add(new ChecklistHeader("Set the Right Price", false, false, false));
        headers.add(new ChecklistHeader("Promote Your Business", false, false, false));
        headers.add(new ChecklistHeader("Plan for Increased Sales", false, false, false));

        return headers;
    }

}
