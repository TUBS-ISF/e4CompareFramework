package de.tu_bs.cs.isf.e4cf.compare.comparator.impl.node;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.Attribute;
import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.Node;

public class StringComparator extends AbstractNodeComparator {

	public StringComparator(String supportedType) {
		super(WILDCARD);
	}

	@Override
	public void compare(Node firstNode, Node secondNode) {
		List<Float> similarities = new ArrayList<Float>();

		// compares for every attribute key, which is unique the corresponding values
		for (Attribute firstAttr : firstNode.getAttributes()) {
			for (Attribute secondAttr : secondNode.getAttributes()) {
				// check if attributes are the same
				if (firstAttr.isAttributeOfSameType(secondAttr)) {
					similarities.add(compareValues(firstAttr, secondAttr));
				}
			}
		}
		// calculate the avarage similarity
		int maxAttributes = Math.max(firstNode.getAttributes().size(), firstNode.getAttributes().size());
		float similarity = maxAttributes > 0 ? sum(similarities) / maxAttributes : 1f;
		setSimilarity(similarity);

	}

	/**
	 * calculates the sum of a list of floats
	 */
	private float sum(List<Float> values) {
		float sum = 0;
		for (float value : values) {
			sum += value;
		}
		return sum;
	}

	/**
	 * compares the values of a corresponding key returns 1 if a match is found else
	 */
	private Float compareValues(Attribute firstAttr, Attribute secondAttr) {
		for (String firstValue : firstAttr.getAttributeValues()) {
			for (String secondValue : secondAttr.getAttributeValues()) {
				if (firstValue.equals(secondValue)) {
					return 1f;
				}
			}
		}
		return 0f;
	}
}
