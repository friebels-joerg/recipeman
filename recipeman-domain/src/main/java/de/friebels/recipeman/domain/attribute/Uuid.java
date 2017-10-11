package de.friebels.recipeman.domain.attribute;

import java.util.UUID;

import de.friebels.domain.attribute.StringAttribute;

public class Uuid extends StringAttribute {
	
	private Uuid(String value) {
		super(value);
	}

	public static Uuid newInstance() {
		String uuid = UUID.randomUUID().toString();
		return new Uuid(uuid);
	}

	public static Uuid fromUuidString(String uuid) {
		return new Uuid(uuid);
	}
}
