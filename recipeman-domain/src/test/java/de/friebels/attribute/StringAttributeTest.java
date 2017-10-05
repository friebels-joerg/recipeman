package de.friebels.attribute;

import static org.junit.Assert.*;

import org.junit.Test;

import de.friebels.attribute.StringAttribute;

public class StringAttributeTest {

	class MyStringAttribute extends StringAttribute {
		protected MyStringAttribute(String value) {
			super(value);
		}
		
	}
	
	@Test
	public void test() {
		StringAttribute sa1 = new MyStringAttribute("Hallo");
		StringAttribute sa2 = new MyStringAttribute("Hallo");
		assertEquals(sa1, sa2);
	}

}
