package de.friebels.attribute;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.friebels.recipeman.domain.attribute.Version;

public class AttributeTest {
	
	@Test
	public void testToString() {
		Attribute<Integer> sut = new Attribute<Integer>(5);
		String actual = sut.toString();
		String expected = "Attribute (5)";
		assertEquals(expected, actual);
	}

	@Test
	public void testToStringWithConcreteClass() {
		Attribute<Integer> sut = Version.fromValue(5);
		String actual = sut.toString();
		String expected = "Version (5)";
		assertEquals(expected, actual);
	}
}