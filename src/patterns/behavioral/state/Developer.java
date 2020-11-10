package patterns.behavioral.state;

import patterns.behavioral.state.activities.Coding;
import patterns.behavioral.state.activities.Reading;
import patterns.behavioral.state.activities.Sleeping;
import patterns.behavioral.state.activities.Training;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) { this.activity = activity; }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Training());
        } else if (activity instanceof Training) {
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        }
    }

    public void justDoIt() { activity.justDoIt(); }
}