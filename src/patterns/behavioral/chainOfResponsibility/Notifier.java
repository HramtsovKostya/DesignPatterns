package patterns.behavioral.chainOfResponsibility;

public abstract class Notifier {
    private final Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) { this.priority = priority; }

    public void setNextNotifier(Notifier nextNotifier) { this.nextNotifier = nextNotifier; }

    public void notifyManager(String message, Priority level) {
        if (level.ordinal() >= priority.ordinal()) write(message);
        if (nextNotifier != null) nextNotifier.notifyManager(message, level);
    }

    public abstract void write(String message);
}