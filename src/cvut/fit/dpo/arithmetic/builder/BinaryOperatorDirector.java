package cvut.fit.dpo.arithmetic.builder;

import cvut.fit.dpo.arithmetic.operand.Operand;

public class BinaryOperatorDirector {

	private Builder<Operand> builder;

	public void setBuilder(Builder<Operand> builder) {
		this.builder = builder;
	}

	public Operand getBinaryOperator() {
		return builder.build();
	}

}
