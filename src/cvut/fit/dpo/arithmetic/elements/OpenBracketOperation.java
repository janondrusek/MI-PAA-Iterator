package cvut.fit.dpo.arithmetic.elements;

import cvut.fit.dpo.pr2.StringPool;

public class OpenBracketOperation implements ExpressionElement {

	@Override
	public String stringValue() {
		return StringPool.LEFT_CURLY_BRACKET;
	}

}
