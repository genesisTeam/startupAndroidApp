package com.genesisteam.apps.startupapp;

/**
 * Created by Aaron on 12/30/2015.
 */
public class ChecklistHeader {

    private String title;
    private boolean isSection;
    private boolean isComplete;
    private boolean isCurrent;

    public ChecklistHeader(String title, boolean isSection, boolean isComplete, boolean isCurrent) {
        this.title = title;
        this.isSection = isSection;
    }

    public String getTitle() {
        return title;
    }

    public boolean isSection() {
        return isSection;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public boolean isCurrent() {
        return isCurrent;
    }



}
