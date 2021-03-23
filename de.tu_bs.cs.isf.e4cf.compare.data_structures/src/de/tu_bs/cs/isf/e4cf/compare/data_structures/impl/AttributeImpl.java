package de.tu_bs.cs.isf.e4cf.compare.data_structures.impl;

import java.util.Set;

import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.AbstractAttribute;

/**
 * Concrete implementation of the Attribute interface.
 * @author Kamil Rosiak
 *
 */
public class AttributeImpl extends AbstractAttribute {
	private static final long serialVersionUID = 4021250213480973744L;

	/**
	 * Create an Attribute with only a key and no value
	 */
	public AttributeImpl(String attrKey) {
		setAttributeKey(attrKey);
	}
	
	/**
	 * Create an Attribute with a kay and corrosponding value
	 */
	public AttributeImpl(String attrKey, String attrValue) {
		this(attrKey);
		addAttributeValue(attrValue);
	}
	
	/**
	 * Create an Attribute with a kay and corrosponding value
	 */
	public AttributeImpl(String attrKey, Set<String> attrValues) {
		this(attrKey);
		getAttributeValues().addAll(attrValues);
	}
}
