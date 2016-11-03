package com.zytrixdev.practice.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }


    public void addTwoForTeamA(View v) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void addThreeForTeamA(View v) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addOneForTeamB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }


    public void addTwoForTeamB(View v) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addThreeForTeamB(View v) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;

        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
