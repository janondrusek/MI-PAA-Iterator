package cvut.fit.dpo.arithmetic.operand;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.elements.Number;
import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents number in the arithmetic expression
 * 
 * @author Jan Kurš
 */
public class NumericOperand implements Operand {

	private Integer value;

	public NumericOperand(Integer value) {
		setValue(value);
	}

	/**
	 * @deprecated use {@link evaluate()} instead
	 */
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public Iterator<ExpressionElement> getInOrderIterator() {
		return new InOrderIterator(this);
	}

	@Override
	public Iterator<ExpressionElement> getPostOrderIterator() {
		return new PostOrderIterator(this);
	}

	@Override
	public Integer evaluate() {
		return getValue();
	}

	@Override
	public List<ExpressionElement> getExpressionElements() {
		List<ExpressionElement> elements = new ArrayList<ExpressionElement>();
		elements.add(new Number(evaluate()));
		return elements;
	}
}
