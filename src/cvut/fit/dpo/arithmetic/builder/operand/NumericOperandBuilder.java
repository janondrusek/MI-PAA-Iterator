package cvut.fit.dpo.arithmetic.builder.operand;

import cvut.fit.dpo.arithmetic.builder.Builder;
import cvut.fit.dpo.arithmetic.operand.NumericOperand;
import cvut.fit.dpo.arithmetic.operand.Operand;

public class NumericOperandBuilder implements Builder<Operand> {

	private Integer number;

	public NumericOperandBuilder(Integer number) {
		this.number = number;
	}

	@Override
	public NumericOperand build() {
		return new NumericOperand(number);
	}

}
