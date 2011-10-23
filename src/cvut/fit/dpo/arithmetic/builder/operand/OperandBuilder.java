package cvut.fit.dpo.arithmetic.builder.operand;

import cvut.fit.dpo.arithmetic.builder.Builder;
import cvut.fit.dpo.arithmetic.operand.Operand;

public abstract class OperandBuilder implements Builder<Operand> {

	private Operand firstOperand;

	private Operand secondOperand;

	protected OperandBuilder(Operand firstOperand, Operand secondOperand) {
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
