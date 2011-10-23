package cvut.fit.dpo.arithmetic.operand;

import java.util.ArrayList;
import java.util.List;

import cvut.fit.dpo.arithmetic.Operand;
import cvut.fit.dpo.arithmetic.elements.CloseBracketOperation;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.elements.OpenBracketOperation;
import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents the Binary operations like + - etc.
 * 
 * @author Jan Kurš
 * 
 */
public abstract class BinaryOperator implements Operand {
	private Operand firstOperand;
	private Operand secondOperand;

	protected abstract Integer evaluate(Integer val1, Integer val2);

	public BinaryOperator(Operand firstOperand, Operand secondOperand) {
		setFirstOperand(firstOperand);
		setSecondOperand(secondOperand);
	}

	private void setFirstOperand(Operand o) {
		firstOperand = o;
	}

	private void setSecondOperand(Operand o) {
		secondOperand = o;
	}

	public Operand getFirstOperand() {
		return firstOperand;
	}

	public Operand getSecondOperand() {
		return secondOperand;
	}

	@Override
	public Integer evaluate() {
		int val1 = getOperandValue(firstOperand);
		int val2 = getOperandValue(secondOperand);

		return evaluate(val1, val2);
	}

	@Override
	public List<ExpressionElement> getExpressionElements() {
		List<ExpressionElement> elements = new ArrayList<ExpressionElement>();

		elements.add(new OpenBracketOperation());
		elements.addAll(getFirstOperand().getExpressionElements());
		elements.add(getOperation());
		elements.addAll(getSecondOperand().getExpressionElements());
		elements.add(new CloseBracketOperation());

		return elements;
	}

	abstract protected ExpressionElement getOperation();

	public InOrderIterator getInOrderIterator() {
		return new InOrderIterator(this);
	}

	public PostOrderIterator getPostOrderIterator() {
		return new PostOrderIterator(this);
	}

	private Integer getOperandValue(Operand o) {
		return o.evaluate();
	}

}
