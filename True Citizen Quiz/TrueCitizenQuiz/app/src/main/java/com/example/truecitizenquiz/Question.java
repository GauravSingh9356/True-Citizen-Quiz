package com.example.truecitizenquiz;

public class Question {
    private int answerResId;
    private boolean ansTrue;
    public Question(int answerResId, boolean ansTrue) {
        this.answerResId = answerResId;
        this.ansTrue = ansTrue;
    }

    public int getAnswerResId() {
        return answerResId;
    }

    public void setAnswerResId(int answerResId) {
        this.answerResId = answerResId;
    }

    public boolean isAnsTrue() {
        return ansTrue;
    }

    public void setAnsTrue(boolean ansTrue) {
        this.ansTrue = ansTrue;
    }
}
