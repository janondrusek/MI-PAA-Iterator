package cvut.fit.dpo.arithmetic.elements;

import cvut.fit.dpo.pr2.StringPool;

public class CloseBracketOperation implements ExpressionElement {

	@Override
	public String stringValue() {
		return StringPool.RIGHT_CURLY_BRACKET;
	}

}
