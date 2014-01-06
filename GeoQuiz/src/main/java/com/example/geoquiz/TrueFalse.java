package com.example.geoquiz;

/**
 * Created with IntelliJ IDEA 12 Community Edition
 * Author: Ervin Barta
 * Date: 06/01/14
 * Time: 23:26
 */
public class TrueFalse {
    private int mQuestion;

    private boolean mTrueQuestion;

    public TrueFalse(int mQuestion, boolean mTrueQuestion) {
        this.mQuestion = mQuestion;
        this.mTrueQuestion = mTrueQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public int getQuestion() {

        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

}
