package de.friebels.recipeman.domain.attribute;

import static org.junit.Assert.*;

import org.junit.Test;

public class VersionTest {

	@Test
	public void testGetNextVersion() {
		Version original =Version.fromValue(2);
		Version nextVersion = original.getNextVersion();
		
		assertEquals(Integer.valueOf(2), original.getValue());
		assertEquals(Integer.valueOf(3), nextVersion.getValue());
	}
}