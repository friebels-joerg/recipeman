package de.friebels.recipeman.domain.attribute;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import de.friebels.attribute.StringAttribute;

public class UuidTest {

	@Test
	public void testNewInstance() {
		StringAttribute sut = Uuid.newInstance();
		
		assertNotNull(sut.getValue());
	}

	@Test
	public void testFromUuidString() {
		String expected = UUID.randomUUID().toString();
		
		StringAttribute sut = Uuid.fromUuidString(expected);
		
		String actual = sut.getValue();
		assertEquals(expected, actual);
	}
}
