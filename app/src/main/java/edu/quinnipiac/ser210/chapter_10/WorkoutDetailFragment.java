package edu.quinnipiac.ser210.chapter_10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Kevin Couillard
 * Chapter 10 Demo
 * 3/23/21
 * WorkoutDetailFragment (Workout v.2)
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            workoutId = savedInstanceState.getLong("workoutId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.text_Title);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.text_Description);
            description.setText(workout.getDesciption());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putLong("workoutId", workoutId);
    }

    public void setWorkout(long id){
        this.workoutId = id;
    }
}