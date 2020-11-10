package patterns.structural.facade;

public class Workflow {
    BadDeveloper badDeveloper = new BadDeveloper();
    JobOfDeveloper jobOfDeveloper = new JobOfDeveloper();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        jobOfDeveloper.doJobOfDeveloper();
        bugTracker.startSprint();
        badDeveloper.doJobBeforeDeadline(bugTracker);
    }
}