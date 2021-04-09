package de.tu_bs.cs.isf.e4cf.compare.interfaces;


/**
 * Template class for the intra clone compare implementation.
 * @author Kamil Rosiak
 *
 * @param <Type>
 */
public abstract class AbstractIntraCompare<Type> implements IntraCompare<Type> {
	private ICompareEngine<Type> compareEngine;
	
	public AbstractIntraCompare(ICompareEngine<Type> compareEngine) {
		setCompareEngine(compareEngine);
	}
	
	@Override
	public ICompareEngine<Type> getCompareEngine() {
		return this.compareEngine;
	}

	public void setCompareEngine(ICompareEngine<Type> compareEngine) {
		this.compareEngine = compareEngine;
	}
}
