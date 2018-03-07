package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int tdTeamA = 0;
    int tdTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchdownDisplayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView6);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void touchdownDisplayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView);
        scoreView.setText(String.valueOf(score));
    }

    public void touchdownTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        tdTeamA = tdTeamA + 1;
        displayForTeamA(scoreTeamA);
        touchdownDisplayForTeamA(tdTeamA);
    }

    public void fieldGoalA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void extraPointA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void safetyA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void touchdownTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        tdTeamB = tdTeamB + 1;
        displayForTeamB(scoreTeamB);
        touchdownDisplayForTeamB(tdTeamB);
    }

    public void fieldGoalB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void extraPointB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void safetyB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        tdTeamA = 0;
        tdTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        touchdownDisplayForTeamA(tdTeamA);
        touchdownDisplayForTeamB(tdTeamB);
    }
}
