package com.example.android.europeanfootbalcounter;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int cornerTeamA = 0;
    int cornerTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A  and B by 1 point.
     */
    public void addOneGoalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void addOneGoalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the penalty score for Team A and B by 1 points.
     */
    public void addOnePenaltyTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        displayForPenaltyTeamA(penaltyTeamA);
    }

    public void addOnePenaltyTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        displayForPenaltyTeamB(penaltyTeamB);
    }

    /**
     * Increase the foul score for Team A and Team B by 1 points.
     */
    public void addOneFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayForFoulTeamA(foulTeamA);
    }
    public void addOneFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayForFoulTeamB(foulTeamB);
    }
    /**
     * Increase the corner score for Team A and Team B by 1 points.
     */
    public void addOneCornerTeamA(View v) {
        cornerTeamA = cornerTeamA + 1;
        displayForCornerTeamA(cornerTeamA);
    }
    public void addOneCornerTeamB(View v) {
        cornerTeamB = cornerTeamB + 1;
        displayForCornerTeamB(cornerTeamB);
    }

    /**
     * Reset all scores .
     */

    public void resetButton(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        cornerTeamA = 0;
        cornerTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForCornerTeamB(cornerTeamB);
        displayForCornerTeamB(cornerTeamA);
        displayForFoulTeamB(foulTeamB);
        displayForFoulTeamA(foulTeamA);
        displayForPenaltyTeamB(penaltyTeamB);
        displayForPenaltyTeamA(penaltyTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPenaltyTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPenaltyTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForCornerTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForCornerTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));
    }









}


