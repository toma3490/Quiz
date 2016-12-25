package com.android.toma.quiz_10;

import java.util.ArrayList;
import java.util.List;

public class ScreenItem {

    private int mImage;
    private String mCorrectValue;
    private String mValue_1;
    private String mValue_2;
    private String mValue_3;
    private List<ScreenItem> mScreenItems;

    public ScreenItem(int image, String correctValue, String value_1, String value_2, String value_3) {
        mImage = image;
        mCorrectValue = correctValue;
        mValue_1 = value_1;
        mValue_2 = value_2;
        mValue_3 = value_3;
    }

    private void initializeData(){
        mScreenItems = new ArrayList<>();
        mScreenItems.add(new ScreenItem(R.drawable.ic_audi, "Audi", "Chrysler", "Mazda", "Honda"));
        mScreenItems.add(new ScreenItem(R.drawable.ic_bentley, "Bentley", "Maserati", "BMW", "Ford"));
        mScreenItems.add(new ScreenItem(R.drawable.ic_cadillac, "Cadillac", "Morris", "Lancia", "Nissan"));
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public String getCorrectValue() {
        return mCorrectValue;
    }

    public void setCorrectValue(String correctValue) {
        mCorrectValue = correctValue;
    }

    public String getValue_1() {
        return mValue_1;
    }

    public void setValue_1(String value_1) {
        mValue_1 = value_1;
    }

    public String getValue_2() {
        return mValue_2;
    }

    public void setValue_2(String value_2) {
        mValue_2 = value_2;
    }

    public String getValue_3() {
        return mValue_3;
    }

    public void setValue_3(String value_3) {
        mValue_3 = value_3;
    }
}
