package com.example.kevintoro.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private int mAnswered;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue =  answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getAnswered() {
        return mAnswered;
    }

    public void setAnswered(int answered) {
        mAnswered = answered;
    }
}
