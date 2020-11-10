package patterns.behavioral.interpreter.expressions;

import patterns.behavioral.interpreter.Expression;

public class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) { this.data = data; }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}