package se.edument.roman;

public class RomanConverter {
	public String toRoman(int number) {
		if (number == 10)
			return "X";
		if (number == 9)
			return "IX";
		if (number >= 5)
			return "V" + times(number - 5, "I");
		if (number == 4)
			return "IV";
		return times(number, "I");
	}

	private String times(int number, String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < number; i++)
			sb.append(string);
		return sb.toString();
	}
}
