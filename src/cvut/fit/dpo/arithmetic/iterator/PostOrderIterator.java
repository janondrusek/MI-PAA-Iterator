package cvut.fit.dpo.arithmetic.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import cvut.fit.dpo.arithmetic.elements.CloseBracketOperation;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.elements.Number;
import cvut.fit.dpo.arithmetic.elements.OpenBracketOperation;
import cvut.fit.dpo.arithmetic.operand.Operand;

public class PostOrderIterator extends AbstractIterator {

	public PostOrderIterator(Operand root) {
		super(root);
	}

	@Override
	protected List<ExpressionElement> collectElements(Operand root) {
		List<ExpressionElement> elements = new LinkedList<ExpressionElement>();
		Stack<ExpressionElement> operators = new Stack<ExpressionElement>();

		for (ExpressionElement element : root.getExpressionElements()) {
			if (element instanceof Number) {
				elements.add(element);
			} else {
				if (element instanceof CloseBracketOperation) {
					while (!(operators.peek() instanceof OpenBracketOperation)) {
						elements.add(operators.pop());
					}
					operators.pop();

				} else {
					operators.add(element);
				}
			}
		}
		elements.addAll(operators);

		return elements;
	}

	@Override
	protected String getDelimiter() {
		return " ";
	}

}
