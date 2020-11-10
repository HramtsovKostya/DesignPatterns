package patterns.behavioral.state.activities;

import patterns.behavioral.state.Activity;

public class Reading implements Activity {

    @Override
    public void justDoIt() { System.out.println("Reading book..."); }
}