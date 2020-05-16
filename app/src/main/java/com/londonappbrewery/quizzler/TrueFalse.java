package com.londonappbrewery.quizzler;

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswers;

    public TrueFalse(int questionResourceID, boolean trueOrFalse){
        mQuestionID = questionResourceID;
        mAnswers = trueOrFalse;

    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean ismAnswers() {
        return mAnswers;
    }

    public void setmAnswers(boolean mAnswers) {
        this.mAnswers = mAnswers;
    }
}
