package de.tu_bs.cs.isf.e4cf.compare;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.e4cf.compare.comparison.interfaces.Comparison;
import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.Node;
import de.tu_bs.cs.isf.e4cf.compare.interfaces.AbstractIntraCompare;
import de.tu_bs.cs.isf.e4cf.compare.interfaces.ICompareEngine;

public class NodeIntraCompare extends AbstractIntraCompare<Node> {

	public NodeIntraCompare(ICompareEngine<Node> compareEngine) {
		super(compareEngine);
	}

	@Override
	public List<List<Comparison<Node>>> getCloneCluster(Node node, String nodeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comparison<Node>> getSimilarArtifactsOfType(Node node, String nodeType) {
		List<Node> nodesOfType = node.getNodesOfType(nodeType);
		List<Comparison<Node>> comparisons = new ArrayList<Comparison<Node>>();
		
		for(Node first : nodesOfType) {
			for(Node second : nodesOfType) {
				comparisons.add(getCompareEngine().compare(first, second));
			}
		}
		
		return comparisons;
	}


	
	

}
