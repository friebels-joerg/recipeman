package de.friebels.domain.attribute;

import de.friebels.domain.attribute.Attribute;

public class ConcreteAttribute extends Attribute<Integer> {

	protected ConcreteAttribute(Integer value) {
		super(value);
	}

	public static Attribute<Integer> fromValue(int i) {
		return new ConcreteAttribute(i);
	}
}