package patterns.behavioral.state.activities;

import patterns.behavioral.state.Activity;

public class Training implements Activity {

    @Override
    public void justDoIt() { System.out.println("Training..."); }
}