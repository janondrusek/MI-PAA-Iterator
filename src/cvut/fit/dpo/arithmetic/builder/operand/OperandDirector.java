package cvut.fit.dpo.arithmetic.builder.operand;

import cvut.fit.dpo.arithmetic.builder.Builder;
import cvut.fit.dpo.arithmetic.operand.Operand;

public class OperandDirector {

	private Builder<Operand> builder;

	public void setBuilder(Builder<Operand> builder) {
		this.builder = builder;
	}

	public Operand getOperand() {
		return builder.build();
	}

}
