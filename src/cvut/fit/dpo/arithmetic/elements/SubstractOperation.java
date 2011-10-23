package cvut.fit.dpo.arithmetic.elements;

import cvut.fit.dpo.pr2.StringPool;

public class SubstractOperation implements ExpressionElement {

	@Override
	public String stringValue() {
		return StringPool.MINUS;
	}
}
