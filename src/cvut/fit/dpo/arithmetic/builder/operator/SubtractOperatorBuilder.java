package cvut.fit.dpo.arithmetic.builder.operator;

import cvut.fit.dpo.arithmetic.builder.operand.OperandBuilder;
import cvut.fit.dpo.arithmetic.operand.Operand;
import cvut.fit.dpo.arithmetic.operand.SubtractOperator;

public class SubtractOperatorBuilder extends OperandBuilder {

	public SubtractOperatorBuilder(Operand firstOperand, Operand secondOperand) {
		super(firstOperand, secondOperand);
	}

	@Override
	public SubtractOperator build() {
		return new SubtractOperator(getFirstOperand(), getSecondOperand());
	}

}
