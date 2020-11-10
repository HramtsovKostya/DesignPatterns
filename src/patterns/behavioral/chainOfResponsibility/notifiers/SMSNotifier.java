package patterns.behavioral.chainOfResponsibility.notifiers;

import patterns.behavioral.chainOfResponsibility.Notifier;
import patterns.behavioral.chainOfResponsibility.Priority;

public class SMSNotifier  extends Notifier {
    public SMSNotifier(Priority priority) { super(priority); }

    @Override
    public void write(String message) { System.out.println("Sending SMS to manager: " + message); }
}
