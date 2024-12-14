package com.example.administration_saklaenhaamim_2221380;

public class FeedbackAnalysis {
    private float mealTC;
    private float sqTC;
    private String sgTC;

    public FeedbackAnalysis(float mealTC, float sqTC, String sgTC) {
        this.mealTC = mealTC;
        this.sqTC = sqTC;
        this.sgTC = sgTC;
    }

    public float getMealTC() {
        return mealTC;
    }

    public void setMealTC(float mealTC) {
        this.mealTC = mealTC;
    }

    public float getSqTC() {
        return sqTC;
    }

    public void setSqTC(float sqTC) {
        this.sqTC = sqTC;
    }

    public String getSgTC() {
        return sgTC;
    }

    public void setSgTC(String sgTC) {
        this.sgTC = sgTC;
    }

    @Override
    public String toString() {
        return "FeedbackAnalysis{" +
                "mealTC=" + mealTC +
                ", sqTC=" + sqTC +
                ", sgTC='" + sgTC + '\'' +
                '}';
    }
}
