package cvut.fit.dpo.arithmetic.builder;

import cvut.fit.dpo.arithmetic.operand.AddOperator;
import cvut.fit.dpo.arithmetic.operand.Operand;

public class AddOperatorBuilder extends BinaryOperatorBuilder {

	public AddOperatorBuilder(Operand firstOperand, Operand secondOperand) {
		super(firstOperand, secondOperand);
	}

	@Override
	public AddOperator build() {
		return new AddOperator(getFirstOperand(), getSecondOperand());
	}

}
