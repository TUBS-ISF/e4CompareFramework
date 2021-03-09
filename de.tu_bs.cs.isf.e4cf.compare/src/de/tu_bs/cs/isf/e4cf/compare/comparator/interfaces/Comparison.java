package de.tu_bs.cs.isf.e4cf.compare.comparator.interfaces;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.Node;

/**
 * data structure for the storage of the comparison between two nodes.
 */
public interface Comparison<Type> extends Serializable {
	/**
	 * This method returns a copy of the given comparison.
	 */
	public void copyComparison(Comparison<Type> comparison);

	/**
	 * This method returns a node that is the result of the merge of both compared
	 * nodes.
	 */
	public Node mergeNodes();

	/**
	 * This method returns the right node of this comparison.
	 */
	public Type getLeftElement();

	/**
	 * This method sets the left element of type Type
	 */
	public void setLeftElement(Type element);

	/**
	 * This method returns the left node of this comparison.
	 */
	public Type getRightElement();

	/**
	 * This method sets the right element of type Type
	 */
	public void setRightElement(Type element);

	/**
	 * This method returns the calculated similarity between both nodes.
	 */
	public float getSimilarityValue();

	/**
	 * This method sets the calculated similarity between both nodes.
	 */
	public void setSimilarity(float similarity);

	public List<Comparison<Type>> getParantComparisons();

	public List<Comparison<Type>> getChildComparisons();

	public void addChildComparison(Comparison<Type> child);

	public void addParentComparison(Comparison<Type> child);

	public void removeChildComparison(Comparison<Type> child);

	public void removeParentComparison(Comparison<Type> child);
	
	public default float getChildSimilarity() {
		float childSimilarity = 0f;
		for (Comparison<Type> child : getChildComparisons()) {
			childSimilarity += child.updateSimilarity();
		}
		return getChildComparisons().size() > 0 ? childSimilarity / getChildComparisons().size() : 0;
	}
	
	
	
	public float updateSimilarity();
	

	public List<Comparator> getComparator();

	public void setComparator(List<Comparator> comparator);

}
