package cvut.fit.dpo.arithmetic.builder;

import cvut.fit.dpo.arithmetic.operand.Operand;

public abstract class BinaryOperatorBuilder implements Builder<Operand> {

	private Operand firstOperand;

	private Operand secondOperand;

	protected BinaryOperatorBuilder(Operand firstOperand, Operand secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}

	protected Operand getFirstOperand() {
		return firstOperand;
	}

	protected Operand getSecondOperand() {
		return secondOperand;
	}

}
