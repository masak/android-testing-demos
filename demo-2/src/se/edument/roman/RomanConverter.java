package se.edument.roman;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class RomanConverter {
	Map<Integer, List<String>> letters = new HashMap<Integer, List<String>>();
	
	{
		letters.put(1,    Arrays.asList("I", "V", "X"));
		letters.put(10,   Arrays.asList("X", "L", "C"));
		letters.put(100,  Arrays.asList("C", "D", "M"));
	}
	
	public String toRoman(int number) {
		return hundreds(number / 100) + tens((number / 10) % 10) + units(number % 10);
	}

	private String generic(int number, int factor) {
		List<String> l = letters.get(factor);
		String i = l.get(0),
		       v = l.get(1),
		       x = l.get(2);

		switch (number) {
		case 1:
		case 2:
		case 3:
			return times(number, i);
		case 4:
			return i + v;
		case 5:
		case 6:
		case 7:
		case 8:
			return v + times(number - 5, i);
		case 9:
			return i + x;
		}
		return "";
	}

	private String units(int number) {
		return generic(number, 1);
	}

	private String tens(int number) {
		return generic(number, 10);
	}

	private String hundreds(int number) {
		return generic(number, 100);
	}

	private String times(int number, String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < number; i++)
			sb.append(string);
		return sb.toString();
	}
}
