package de.friebels.recipeman.domain.recipe;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecipeBuilderTest {

	@Test
	public void test() {
		RecipeBuilder sut = new RecipeBuilder();
		String expected = "hallo";
		Recipe actual = sut.setName(expected).build();
		assertEquals(expected, actual.getName().getValue());
	}

}
