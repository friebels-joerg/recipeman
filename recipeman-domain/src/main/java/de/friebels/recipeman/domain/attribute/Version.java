package de.friebels.recipeman.domain.attribute;

import de.friebels.domain.attribute.IntegerAttribute;

public class Version extends IntegerAttribute {
	private Version(Integer value) {
		super(value);
	}

	public static Version fromValue(Integer value) {
		return new Version(value);
	}

	public Version getNextVersion() {
		return new Version(getValue() + 1);
	}
}