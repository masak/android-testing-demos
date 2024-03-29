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

	public void testConvert4() {
		Assert.assertEquals("IV", converter.toRoman(4));
	}

	public void testConvert5() {
		Assert.assertEquals("V", converter.toRoman(5));
	}

	public void testConvert6() {
		Assert.assertEquals("VI", converter.toRoman(6));
	}

	public void testConvert9() {
		Assert.assertEquals("IX", converter.toRoman(9));
	}

	public void testConvert10() {
		Assert.assertEquals("X", converter.toRoman(10));
	}

	public void testConvert53() {
		Assert.assertEquals("LIII", converter.toRoman(53));
	}

	public void testConvert100() {
		Assert.assertEquals("C", converter.toRoman(100));
	}

	public void testConvert639() {
		Assert.assertEquals("DCXXXIX", converter.toRoman(639));
	}
}
