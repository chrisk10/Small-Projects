import java.util.*;

public class NameCalculator {
	
	private Map<Character, Integer> letterMap;
	private String firstName;
	private String secondName;
	private char[] nameCombined;
	
	public NameCalculator(String name1, String name2) {
		letterMap = prepMap();
		nameCombined = prepStrArry(name1, name2);
		firstName = name1;
		secondName = name2;
		
	}
	
	private Map<Character, Integer> prepMap() {
		Map<Character, Integer> result = 
				new HashMap<Character, Integer>();
		result.put('ㄱ', 2);
		result.put('ㄴ', 1);
		result.put('ㄷ', 2);
		result.put('ㄹ', 3);
		result.put('ㅁ', 3);
		result.put('ㅂ', 5);
		result.put('ㅅ', 2);
		result.put('ㅇ', 1);
		result.put('ㅈ', 3);
		result.put('ㅊ', 4);
		result.put('ㅋ', 2);
		result.put('ㅌ', 3);
		result.put('ㅍ', 7);
		result.put('ㅎ', 4);
		result.put('ㅏ', 2);
		result.put('ㅑ', 3);
		result.put('ㅓ', 2);
		result.put('ㅕ', 3);
		result.put('ㅗ', 2);
		result.put('ㅛ', 3);
		result.put('ㅜ', 2);
		result.put('ㅠ', 3);
		result.put('ㅡ', 1);
		result.put('ㅣ', 1);
		return result;
	}
	
	private char[] prepStrArry(String name1, String name2) {
		char[] result = new char[name1.length() + name2.length()];
		int index = 0;
		for (int i = 0; i < result.length; i++) {
			if (!name1.isEmpty()) {
				result[index] = name1.charAt(0);
				name1 = name1.substring(1);
				index++;
			}
			if (!name2.isEmpty()) {
				result[index] = name2.charAt(0);
				name2 = name2.substring(1);
				index++;
			}
		}
		return result;
	}
}
