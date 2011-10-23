package cvut.fit.dpo.arithmetic;

import java.util.List;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

public interface Operand extends EvaluableInteger {
	public List<ExpressionElement> getExpressionElements();
}
