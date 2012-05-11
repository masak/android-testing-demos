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

	public void testConvert2() {
		Assert.assertEquals("II", converter.toRoman(2));
	}

	public void testConvert3() {
		Assert.assertEquals("III", converter.toRoman(3));
	}
}
