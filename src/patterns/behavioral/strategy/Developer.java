package patterns.behavioral.strategy;

import patterns.behavioral.state.Activity;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) { this.activity = activity; }
    public void executeActivity() { activity.justDoIt(); }
}