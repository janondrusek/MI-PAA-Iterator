package cvut.fit.dpo.arithmetic.builder;

import cvut.fit.dpo.arithmetic.operand.Operand;
import cvut.fit.dpo.arithmetic.operand.SubtractOperator;

public class SubtractOperatorBuilder extends BinaryOperatorBuilder {

	public SubtractOperatorBuilder(Operand firstOperand, Operand secondOperand) {
		super(firstOperand, secondOperand);
	}

	@Override
	public SubtractOperator build() {
		return new SubtractOperator(getFirstOperand(), getSecondOperand());
	}

}
