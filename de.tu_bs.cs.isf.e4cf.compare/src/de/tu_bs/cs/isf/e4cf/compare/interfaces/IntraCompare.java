package de.tu_bs.cs.isf.e4cf.compare.interfaces;

import java.util.List;

import de.tu_bs.cs.isf.e4cf.compare.comparison.interfaces.Comparison;
import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.Node;

/**
 * Interface for the comparison of artifacts within a specific data structure of generic type.
 * @author Kamil Rosiak
 *
 * @param <Type>
 */
public interface IntraCompare<Type> {
	/**
	 * This method returns a instance of a given compare engine
	 */
	public ICompareEngine<Type> getCompareEngine();
	
	/**
	 * This method returns a List of lists in which all similar artifacts are contained (Clone Cluster)
	 */
	public List<List<Comparison<Type>>> getCloneCluster(Node node, String nodeType);
	
	/**
	 * Compares all nodes of the given type within a variant.
	 */
	public List<Comparison<Type>> getSimilarArtifactsOfType(Node node, String nodeType);
	
}
