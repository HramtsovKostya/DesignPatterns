package patterns.structural.facade;

public class BadDeveloper {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrahabr...");
        }
    }
}