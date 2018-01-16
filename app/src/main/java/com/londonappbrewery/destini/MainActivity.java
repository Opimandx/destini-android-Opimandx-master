package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mstoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex = 1;

    private StoriesAnswerClass[] mStoryBank = new StoriesAnswerClass[]{
            new StoriesAnswerClass(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoriesAnswerClass(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoriesAnswerClass(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoriesAnswerClass(R.string.T4_End, 0, 0),
            new StoriesAnswerClass(R.string.T5_End, 0, 0),
            new StoriesAnswerClass(R.string.T6_End, 0, 0)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mstoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mButtonTop = (Button) findViewById(R.id.buttonTop);

        if (savedInstanceState!=null){
            mStoryIndex = savedInstanceState.getInt("IndexKey");
            updateStoryAndAnswer(mStoryIndex);
        }
        else
            mStoryIndex=1;
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1) {
                    mStoryIndex = mStoryIndex + 2;
                    updateStoryAndAnswer(mStoryIndex);
                }
                else if (mStoryIndex==3){
                    mStoryIndex = mStoryIndex+3;
                    updateStoryAndAnswer(mStoryIndex);
                    Log.d("Index 6","Index upgraded to 6");
                }

                else if (mStoryIndex==2){
                    mStoryIndex=mStoryIndex+1;
                    updateStoryAndAnswer(mStoryIndex);
                }



            }


        });
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex==1){
                mStoryIndex = mStoryIndex+1;
                updateStoryAndAnswer(mStoryIndex);
                }
                else if (mStoryIndex==2){
                    mStoryIndex = mStoryIndex+2;
                    updateStoryAndAnswer(mStoryIndex);
                    Log.d("found","Index = 4");
                }
                else if (mStoryIndex==3){
                    mStoryIndex = mStoryIndex+2;
                    updateStoryAndAnswer(mStoryIndex);
                }
            }
        });
    }


    // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    private void updateStoryAndAnswer(int indexAnswer){


            indexAnswer = indexAnswer - 1;
            int storyUpdateIndex;
            int answerTopUpdate;
            int answerBottUpdate;

            if (indexAnswer<=2) {
                storyUpdateIndex = mStoryBank[indexAnswer].getIndexStories();

                answerTopUpdate = mStoryBank[indexAnswer].getTopButtonAnswer();
                answerBottUpdate = mStoryBank[indexAnswer].getBottomButtonAnswer();

                mstoryTextView.setText(storyUpdateIndex);
                mButtonTop.setText(answerTopUpdate);
                mButtonBottom.setText(answerBottUpdate);
            }
            else if (indexAnswer>=3){
                storyUpdateIndex = mStoryBank[indexAnswer].getIndexStories();
                Log.d("miss string","take from index");
                mstoryTextView.setText(storyUpdateIndex);
                Log.d("miss string","SET");
                mButtonTop.setVisibility(View.INVISIBLE);
                mButtonBottom.setVisibility(View.INVISIBLE);
            }
        }

        @Override
    public void onSaveInstanceState(Bundle outState){
            super.onSaveInstanceState(outState);
            outState.putInt("IndexKey",mStoryIndex);
        }

        }










