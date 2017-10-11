package de.friebels.recipeman.domain.attribute;

import de.friebels.domain.attribute.StringAttribute;

public class Name extends StringAttribute{

	private  Name(String value) {
		super(value);
	}
	
	public static Name fromValue(String value) {
		return new Name(value);
	}
}