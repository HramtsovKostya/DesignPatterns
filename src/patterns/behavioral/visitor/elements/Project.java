package patterns.behavioral.visitor.elements;

import patterns.behavioral.visitor.Developer;
import patterns.behavioral.visitor.ProjectElement;

public class Project implements ProjectElement {
    ProjectElement [] projectElements;

    public Project() {
        projectElements = new ProjectElement[] {
            new ProjectClass(), new Database(), new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElements)
            element.beWritten(developer);
    }
}