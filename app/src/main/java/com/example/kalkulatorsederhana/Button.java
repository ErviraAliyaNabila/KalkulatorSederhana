package com.example.kalkulatorsederhana;

public class Button {
    private MainActivity onClickListener;

    public void setOnClickListener(MainActivity onClickListener) {
        this.onClickListener = onClickListener;
    }

    public MainActivity getOnClickListener() {
        return onClickListener;
    }
}
