import java.util.HashMap;

public class firstUniqChar {

	public char firstUniqChar(String s) {
	    // 你的代码写在这里
	    // 提示：先用 HashMap 统计字符出现次数
	    // 再遍历字符串找到第一个计数为1的字符

		HashMap<Character, Integer> map = new HashMap<>();

		for (char character : s.toCharArray()) {
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
			}
			else {
				map.put(character, 1);
			}

		}
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				return s.charAt(i);
			}
		}

		return ' ';
	}


	public static void main (String[] args) {
		firstUniqChar sol = new firstUniqChar();

		 String test1 = "leetcode";
	        System.out.println("字符串: " + test1);
	        System.out.println("第一个唯一字符: '" + sol.firstUniqChar(test1) + "'");

	        System.out.println("\n---\n");

	        String test2 = "loveleetcode";
	        System.out.println("字符串: " + test2);
	        System.out.println("第一个唯一字符: " + sol.firstUniqChar(test2));
	}

}
