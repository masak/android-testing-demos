package se.edument.roman;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RomanConverterTest extends TestCase {
	private RomanConverter converter;

	public void setUp() {
		converter = new RomanConverter();
	}

	public void testConvert1() {
		Assert.assertEquals("I", converter.toRoman(1));
	}
}
