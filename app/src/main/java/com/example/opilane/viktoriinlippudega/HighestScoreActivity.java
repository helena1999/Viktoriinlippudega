package com.example.opilane.viktoriinlippudega;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HighestScoreActivity extends AppCompatActivity {

    TextView txtScore, txtHighScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        txtScore = (TextView)findViewById(R.id.textScore);
        txtHighScore = (TextView)findViewById(R.id.textHighScore);
        //receive the score from last activity by intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        //display current score
        txtScore.setText("Your score: " + score);
        //use shared preferences to save the best score
        //create shared preferences variable in private mode
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        //get shared prefences results for the highest score //
        // in case you find currently shared prefences with high score key you
        //will save that high score value if its not 0(null)
        int highscore = mypref.getInt("highscore", 0);
        if (highscore >= score)
            txtHighScore.setText("High score: " + highscore);
        else {
            txtHighScore.setText("New highscore: " + score);
            //update the highest score in shared prefences-->
            //activate shared pref.editor put in high score location with score
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }
     public void onClick(View view) {

         Intent intent = new Intent(HighestScoreActivity.this, MainActivity.class);
         startActivity(intent);
     }
}
