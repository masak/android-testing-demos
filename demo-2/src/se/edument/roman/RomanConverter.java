package se.edument.roman;

public class RomanConverter {
	public String toRoman(int number) {
		return times(number, "I");
	}

	private String times(int number, String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < number; i++)
			sb.append(string);
		return sb.toString();
	}
}
