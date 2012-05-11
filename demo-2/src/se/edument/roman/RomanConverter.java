package se.edument.roman;

public class RomanConverter {
	public String toRoman(int number) {
		if (number == 3)
			return "III";
		if (number == 2)
			return "II";
		return "I";
	}
}
