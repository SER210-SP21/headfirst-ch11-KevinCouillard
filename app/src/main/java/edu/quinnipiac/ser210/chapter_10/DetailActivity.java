package edu.quinnipiac.ser210.chapter_10;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/**
 * Kevin Couillard
 * Chapter 10 Demo
 * 3/23/21
 * DetailActivity (Workout v.2)
 */
public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkoutDetailFragment frag = (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkout(workoutId);
    }
}