package cvut.fit.dpo.arithmetic.iterator;

import java.util.List;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.operand.BinaryOperator;

public class InOrderIterator extends AbstractIterator {

	public InOrderIterator(BinaryOperator root) {
		super(root);
	}

	@Override
	protected List<ExpressionElement> collectElements(BinaryOperator root) {
		return root.getExpressionElements();
	}
}
