package de.friebels.recipeman.domain.recipe;

import de.friebels.recipeman.domain.attribute.Name;
import de.friebels.recipeman.domain.attribute.Uuid;
import de.friebels.recipeman.domain.attribute.Version;

public class Recipe implements Cloneable {
	private Uuid id;
	private Version version;
	private Name name;

	Recipe() {
		id = Uuid.newInstance();
		version = Version.fromValue(1);
	}
	
	public Uuid getId() {
		return id;
	}

	public Version getVersion() {
		return version;
	}
	
	public Recipe setName(Name name) {
		Recipe clone = clone();
		clone.name = name;
		return clone;
	}

	public Recipe increaseVersion() {
		Recipe clone = clone();
		clone.version = version.getNextVersion();
		return clone;
	}
	
	public Name getName() {
		return name;
	}

	protected Recipe clone() {
		Recipe clone = null;
		try {
			clone = (Recipe) super.clone();
		} catch (CloneNotSupportedException e) {
			// should not occure: Recipe is clonable
		}
		return clone;
	}
}
