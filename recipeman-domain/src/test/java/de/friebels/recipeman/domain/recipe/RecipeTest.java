package de.friebels.recipeman.domain.recipe;

import static org.junit.Assert.*;

import org.junit.Test;

import de.friebels.recipeman.domain.attribute.Name;

public class RecipeTest {

	@Test
	public void testSetName() {
		Recipe original = new Recipe();
		Name expected = Name.fromValue("Spareribs nach Art des Hauses");
		Recipe actual = original.setName(expected);
		assertNotSame(original, actual);
		assertNull(original.getName());
		assertEquals(actual.getName(), expected);
	}

	@Test
	public void testIncreaseVersion() {
		Recipe original = new Recipe();
		Recipe actual = original.increaseVersion();
		assertNotSame(original, actual);
		assertEquals(Integer.valueOf(1), original.getVersion().getValue());
		assertEquals(Integer.valueOf(2), actual.getVersion().getValue());
	}


}
