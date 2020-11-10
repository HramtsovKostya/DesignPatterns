package patterns.behavioral.visitor;

import patterns.behavioral.visitor.elements.Database;
import patterns.behavioral.visitor.elements.ProjectClass;
import patterns.behavioral.visitor.elements.Test;

public interface Developer {
    void create(ProjectClass projectClass);
    void create(Database database);
    void create(Test test);
}