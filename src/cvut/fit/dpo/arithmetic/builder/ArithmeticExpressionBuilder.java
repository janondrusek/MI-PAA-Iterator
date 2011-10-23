package cvut.fit.dpo.arithmetic.builder;

import java.util.Stack;

import cvut.fit.dpo.arithmetic.ArithmeticExpression;
import cvut.fit.dpo.arithmetic.builder.operand.NumericOperandBuilder;
import cvut.fit.dpo.arithmetic.builder.operand.OperandDirector;
import cvut.fit.dpo.arithmetic.builder.operator.AddOperatorBuilder;
import cvut.fit.dpo.arithmetic.builder.operator.SubtractOperatorBuilder;
import cvut.fit.dpo.arithmetic.operand.Operand;
import cvut.fit.dpo.pr2.StringPool;

public class ArithmeticExpressionBuilder implements Builder<ArithmeticExpression> {

	private String[] tokens;

	private OperandDirector director = new OperandDirector();

	public ArithmeticExpressionBuilder(String[] tokens) {
		this.tokens = tokens;
	}

	public ArithmeticExpression build() {
		ArithmeticExpression expression = new ArithmeticExpression();
		expression.setRoot(getOperand(getBuilder()));

		return expression;
	}

	private Builder<Operand> getBuilder() {
		Stack<Builder<Operand>> operands = new Stack<Builder<Operand>>();
		for (String token : tokens) {
			if (isNumeric(token)) {
				operands.add(getBuilder(Integer.valueOf(token)));
			} else {
				operands.add(getBuilder(token, operands));
			}
		}
		return operands.pop();
	}

	private Builder<Operand> getBuilder(Integer number) {
		return new NumericOperandBuilder(number);
	}

	private Builder<Operand> getBuilder(String operator, Stack<Builder<Operand>> operands) {
		if (StringPool.MINUS.equals(operator)) {
			return getSubtractOperatorBuilder(operands.pop(), operands.pop());
		} else if (StringPool.PLUS.equals(operator)) {
			return getAddOperatorBuilder(operands.pop(), operands.pop());
		} else {
			throw new IllegalArgumentException(operator);
		}
	}

	private SubtractOperatorBuilder getSubtractOperatorBuilder(Builder<Operand> firstOperandBuilder,
			Builder<Operand> secondOperandBuilder) {
		return new SubtractOperatorBuilder(getOperand(secondOperandBuilder), getOperand(firstOperandBuilder));
	}

	private AddOperatorBuilder getAddOperatorBuilder(Builder<Operand> firstOperandBuilder,
			Builder<Operand> secondOperandBuilder) {
		return new AddOperatorBuilder(getOperand(secondOperandBuilder), getOperand(firstOperandBuilder));
	}

	private Operand getOperand(Builder<Operand> builder) {
		director.setBuilder(builder);
		return director.getOperand();
	}

	private boolean isNumeric(String token) {
		try {
			Integer.parseInt(token);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
