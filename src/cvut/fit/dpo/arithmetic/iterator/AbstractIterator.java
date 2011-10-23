package cvut.fit.dpo.arithmetic.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import cvut.fit.dpo.arithmetic.operand.BinaryOperator;

abstract public class AbstractIterator implements Iterator<ExpressionElement> {

	private int current = 0;

	private List<ExpressionElement> elements = new ArrayList<ExpressionElement>();

	protected AbstractIterator(BinaryOperator root) {
		elements = collectElements(root);
	}

	abstract protected List<ExpressionElement> collectElements(BinaryOperator root);

	private void rewind() {
		current = 0;
	}

	@Override
	public boolean hasNext() {
		return elements.size() >= current + 1;
	}

	@Override
	public ExpressionElement next() {
		try {
			return elements.get(current++);
		} catch (Exception e) {
			throw new NoSuchElementException();
		}
	}

	@Override
	public void remove() {
		elements.remove(current);
	}

	@Override
	public String toString() {
		String[] fields = new String[elements.size()];

		rewind();
		while (hasNext()) {
			fields[current] = next().stringValue();
		}
		return Arrays.toString(fields).replace(", ", getDelimiter()).replaceAll("[\\[\\]]", "");
	}

	protected String getDelimiter() {
		return "";
	}

}
