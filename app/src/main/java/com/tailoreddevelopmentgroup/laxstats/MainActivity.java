package com.tailoreddevelopmentgroup.laxstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mUsScore;
    TextView mThemScore;
    TextView mFaceoffs;
    TextView mPasses;
    TextView mGroundBalls;
    TextView mShots;

    int mUsCounter;
    int mThemCounter;
    int mFaceoffsCounter;
    int mPassesCounter;
    int mGroundBallsCounter;
    int mShotsCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsScore = (TextView) findViewById(R.id.us_goal_amount);
        mThemScore = (TextView) findViewById(R.id.them_goal_amount);

        mFaceoffs = (TextView) findViewById(R.id.faceoffs_won_text_view);
        mPasses = (TextView) findViewById(R.id.passes_text_view);
        mGroundBalls = (TextView) findViewById(R.id.ground_balls_text_view);
        mShots = (TextView) findViewById(R.id.shots_text_view);

        Button usIncreaseScore = (Button) findViewById(R.id.us_plus_goal);
        Button usDecreaseScore = (Button) findViewById(R.id.us_minus_goal);
        Button themIncreaseScore = (Button) findViewById(R.id.them_plus_goal);
        Button themDecreaseScore = (Button) findViewById(R.id.them_minus_goal);

        Button increaseFaceoffs = (Button) findViewById(R.id.plus_faceoff);
        Button decreaseFaceoffs = (Button) findViewById(R.id.minus_faceoff);
        Button increasePasses = (Button) findViewById(R.id.plus_passes);
        Button decreasePasses = (Button) findViewById(R.id.minus_passes);
        Button increaseGroundBalls = (Button) findViewById(R.id.plus_gb);
        Button decreaseGroundBalls = (Button) findViewById(R.id.minus_gb);
        Button increaseShots = (Button) findViewById(R.id.plus_shots);
        Button decreaseShots = (Button) findViewById(R.id.minus_shots);

        usIncreaseScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mUsCounter++;
                mUsScore.setText(String.valueOf(mUsCounter));

            }
        });

        usDecreaseScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mUsCounter > 0) {
                    mUsCounter--;
                }

                mUsScore.setText(String.valueOf(mUsCounter));

            }
        });

        themIncreaseScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mThemCounter++;
                mThemScore.setText(String.valueOf(mThemCounter));

            }
        });

        themDecreaseScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mThemCounter > 0) {
                    mThemCounter--;
                }

                mThemScore.setText(String.valueOf(mThemCounter));

            }
        });

        increaseFaceoffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mFaceoffsCounter++;
                mFaceoffs.setText(String.valueOf(mFaceoffsCounter));

            }
        });

        decreaseFaceoffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mFaceoffsCounter > 0) {
                    mFaceoffsCounter--;
                }

                mFaceoffs.setText(String.valueOf(mFaceoffsCounter));

            }
        });

        increasePasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mFaceoffsCounter++;
                mPasses.setText(String.valueOf(mFaceoffsCounter));

            }
        });

        decreasePasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mFaceoffsCounter > 0) {
                    mFaceoffsCounter--;
                }

                mPasses.setText(String.valueOf(mFaceoffsCounter));

            }
        });

        increaseGroundBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mGroundBallsCounter++;
                mGroundBalls.setText(String.valueOf(mGroundBallsCounter));

            }
        });

        decreaseGroundBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mGroundBallsCounter > 0) {
                    mGroundBallsCounter--;
                }

                mGroundBalls.setText(String.valueOf(mGroundBallsCounter));

            }
        });

        increaseShots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mShotsCounter++;
                mShots.setText(String.valueOf(mShotsCounter));

            }
        });

        decreaseShots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mShotsCounter > 0) {
                    mShotsCounter--;
                }

                mShots.setText(String.valueOf(mShotsCounter));

            }
        });
    }
}
