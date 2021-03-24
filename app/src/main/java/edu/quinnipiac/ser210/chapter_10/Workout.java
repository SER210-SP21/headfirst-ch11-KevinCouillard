package edu.quinnipiac.ser210.chapter_10;
/**
 * Kevin Couillard
 * Chapter 10 Demo
 * 3/23/21
 * Workout (Workout v.2)
 */
public class Workout {
    private String name;
    private String desciption;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 HandStand push-ups \n10 1-legged squats \n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups \n100 Push-ups \n100 Squats"),
            new Workout("Strength and Length", "500 meter run \n21 x 1.5 pood kettleball swing \n21 x pull-ups"),
            new Workout("The Wimp Special", "5 Pull-ups \n10 Push-ups \n15 Squats")
    };

    private Workout(String name, String desciption) {
        this.name = name;
        this.desciption = desciption;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
