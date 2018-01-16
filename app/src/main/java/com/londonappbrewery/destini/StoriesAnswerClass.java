package com.londonappbrewery.destini;

/**
 * Created by opimand on 16.01.2018.
 */

public class StoriesAnswerClass {
    int mIndexStories;
    int mTopButtonAnswer;
    int mBottomButtonAnswer;

    public StoriesAnswerClass(int indexStories, int topButtonAnswer, int bottomButtonAnswer) {
        mIndexStories = indexStories;
        mTopButtonAnswer = topButtonAnswer;
        mBottomButtonAnswer = bottomButtonAnswer;
    }

    public int getIndexStories() {
        return mIndexStories;
    }

    public void setIndexStories(int indexStories) {
        mIndexStories = indexStories;
    }

    public int getTopButtonAnswer() {
        return mTopButtonAnswer;
    }

    public void setTopButtonAnswer(int topButtonAnswer) {
        mTopButtonAnswer = topButtonAnswer;
    }

    public int getBottomButtonAnswer() {
        return mBottomButtonAnswer;
    }

    public void setBottomButtonAnswer(int bottomButtonAnswer) {
        mBottomButtonAnswer = bottomButtonAnswer;
    }
}
