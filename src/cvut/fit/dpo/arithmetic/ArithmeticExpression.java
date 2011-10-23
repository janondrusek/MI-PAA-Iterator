package cvut.fit.dpo.arithmetic;

import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.operand.BinaryOperator;

public class ArithmeticExpression
{
	private BinaryOperator root;
	
	public Integer evaluate()
	{
		return root.evaluate();
	}
	
	public void setRoot(BinaryOperator root)
	{
		this.root = root;
	}

	/**
	 * {@link #root} field getter.
	 * 
	 * @deprecated Do not provide access to the inner representation
	 */
	public BinaryOperator getRoot()
	{
		throw new UnsupportedOperationException();
	}
	
	public Iterator<ExpressionElement> getInOrderIterator()
	{
		return root.getInOrderIterator();
	}

	public Iterator<ExpressionElement> getPostOrderIterator()
	{
		return root.getPostOrderIterator();
	}

}
