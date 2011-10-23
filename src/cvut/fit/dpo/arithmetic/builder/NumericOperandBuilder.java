package cvut.fit.dpo.arithmetic.builder;

import cvut.fit.dpo.arithmetic.operand.NumericOperand;
import cvut.fit.dpo.arithmetic.operand.Operand;

public class NumericOperandBuilder implements Builder<Operand> {

	private Integer number;

	protected NumericOperandBuilder(Integer number) {
		this.number = number;
	}

	@Override
	public NumericOperand build() {
		return new NumericOperand(number);
	}

}
