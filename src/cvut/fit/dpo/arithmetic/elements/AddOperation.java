package cvut.fit.dpo.arithmetic.elements;

import cvut.fit.dpo.pr2.StringPool;

public class AddOperation implements ExpressionElement {

	@Override
	public String stringValue() {
		return StringPool.PLUS;
	}
}
