package patterns.behavioral.chainOfResponsibility.notifiers;

import patterns.behavioral.chainOfResponsibility.Notifier;
import patterns.behavioral.chainOfResponsibility.Priority;

public class ReportNotifier extends Notifier {
    public ReportNotifier(Priority priority) { super(priority); }

    @Override
    public void write(String message) { System.out.println("Notifying using simple report: " + message); }
}
