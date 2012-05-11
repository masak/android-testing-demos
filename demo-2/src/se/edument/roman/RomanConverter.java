package se.edument.roman;

public class RomanConverter {
	public String toRoman(int number) {
		return hundreds(number / 100) + tens((number / 10) % 10) + units(number % 10);
	}

	private String hundreds(int number) {
		if (number == 9)
			return "CM";
		if (number >= 5)
			return "D" + times(number - 5, "C");
		if (number == 4)
			return "CD";
		return times(number, "C");
	}

	private String tens(int number) {
		if (number == 9)
			return "XC";
		if (number >= 5)
			return "L" + times(number - 5, "X");
		if (number == 4)
			return "XL";
		return times(number, "X");
	}

	private String units(int number) {
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
