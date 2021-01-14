package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    public Button firstAnswer;
    public Button secondAnswer;
    public TextView mTextView;
    public int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        firstAnswer = (Button) findViewById(R.id.buttonTop);
        secondAnswer = (Button) findViewById(R.id.buttonBottom);
        mTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        firstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (mStoryIndex == 1) {
                   mTextView.setText(R.string.T3_Story);
                   firstAnswer.setText(R.string.T3_Ans1);
                   secondAnswer.setText(R.string.T3_Ans2);
                   mStoryIndex = 3;
               } else if (mStoryIndex == 3) {
                   firstAnswer.setVisibility(View.GONE);
                   secondAnswer.setVisibility(View.GONE);
                   mTextView.setText(R.string.T6_End);
               } else if (mStoryIndex == 2){
                   mTextView.setText(R.string.T3_Story);
                   firstAnswer.setText(R.string.T3_Ans1);
                   secondAnswer.setText(R.string.T3_Ans2);
                   mStoryIndex = 3;
               }


            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        secondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (mStoryIndex == 1)  {
                 mTextView.setText(R.string.T2_Story);
                 firstAnswer.setText(R.string.T2_Ans1);
                 secondAnswer.setText(R.string.T2_Ans2);
                 mStoryIndex = 2;
             } else if (mStoryIndex == 2){
                 firstAnswer.setVisibility(View.GONE);
                 secondAnswer.setVisibility(View.GONE);
                 mTextView.setText(R.string.T4_End);
             } else if (mStoryIndex == 3){
                 firstAnswer.setVisibility(View.GONE);
                 secondAnswer.setVisibility(View.GONE);
                 mTextView.setText(R.string.T5_End);

             }
            }
        });


    }
}
