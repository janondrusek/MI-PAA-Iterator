package cvut.fit.dpo.arithmetic.iterator;

import java.util.List;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.operand.Operand;

public class InOrderIterator extends AbstractIterator {

	public InOrderIterator(Operand root) {
		super(root);
	}

	@Override
	protected List<ExpressionElement> collectElements(Operand root) {
		return root.getExpressionElements();
	}
}
