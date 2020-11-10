package patterns.behavioral.visitor.elements;

import patterns.behavioral.visitor.Developer;
import patterns.behavioral.visitor.ProjectElement;

public class ProjectClass implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}