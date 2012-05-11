package se.edument.roman;

public class RomanConverter {
	public String toRoman(int number) {
		return hundreds(number / 100) + tens((number / 10) % 10) + units(number % 10);
	}

	private String hundreds(int number) {
		switch (number) {
		case 1:
		case 2:
		case 3:
			return times(number, "C");
		case 4:
			return "CD";
		case 5:
		case 6:
		case 7:
		case 8:
			return "D" + times(number - 5, "C");
		case 9:
			return "CM";
		}
		return "";
	}

	private String tens(int number) {
		switch (number) {
		case 1:
		case 2:
		case 3:
			return times(number, "X");
		case 4:
			return "XL";
		case 5:
		case 6:
		case 7:
		case 8:
			return "L" + times(number - 5, "X");
		case 9:
			return "XC";
		}
		return "";
	}

	private String units(int number) {
		switch (number) {
		case 1:
		case 2:
		case 3:
			return times(number, "I");
		case 4:
			return "IV";
		case 5:
		case 6:
		case 7:
		case 8:
			return "V" + times(number - 5, "I");
		case 9:
			return "IX";
		}
		return "";
	}

	private String times(int number, String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < number; i++)
			sb.append(string);
		return sb.toString();
	}
}
