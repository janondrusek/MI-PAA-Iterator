package cvut.fit.dpo.arithmetic.operand;

import java.util.Iterator;
import java.util.List;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

public interface Operand {

	public Integer evaluate();

	public List<ExpressionElement> getExpressionElements();

	public Iterator<ExpressionElement> getInOrderIterator();

	public Iterator<ExpressionElement> getPostOrderIterator();
}
