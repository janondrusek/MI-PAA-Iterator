package cvut.fit.dpo.arithmetic;

import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.operand.Operand;

public class ArithmeticExpression {
	private Operand root;

	public Integer evaluate() {
		return root.evaluate();
	}

	public void setRoot(Operand root) {
		this.root = root;
	}

	/**
	 * {@link #root} field getter.
	 * 
	 * @deprecated Do not provide access to the inner representation
	 */
	public Operand getRoot() {
		throw new UnsupportedOperationException();
	}

	public Iterator<ExpressionElement> getInOrderIterator() {
		return root.getInOrderIterator();
	}

	public Iterator<ExpressionElement> getPostOrderIterator() {
		return root.getPostOrderIterator();
	}

}
