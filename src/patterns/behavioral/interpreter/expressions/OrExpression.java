package patterns.behavioral.interpreter.expressions;

import patterns.behavioral.interpreter.Expression;

public class OrExpression implements Expression {
    private final Expression firstExpression;
    private final Expression secondExpression;

    public OrExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpression.interpret(context);
    }
}