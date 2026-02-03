import java.util.*;

public class HashSetExample {

    public static void main (String[] args) {
		Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // This wound not be added

        for (String s : set){
            System.out.println(s);
        }

        // Common Use of Set
        set.contains("Apple");
        set.remove("Banana");
        set.size();
        set.isEmpty();

        int[] testArray = {1, 2, 3, 4, 5};
        int[] testArray2 = {2,3};
        String t1 = "anagram";
        String t2 = "nagaram";
        String t3 = "anagrat";
        // System.out.println(containsDuplicate(testArray));
        // System.out.println(Arrays.toString(intersection(testArray, testArray2)));
        System.out.println(isAnagram(t1, t2));

	}

    // Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            // If failed add, return true
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    //Intersection of Two Arrays
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num1 : nums1){
            set.add(num1);
        }
        for (int num2 : nums2){
            if (!set.add(num2)){
                resultSet.add(num2);
            }
        }

        int[] res = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet){
            res[i++] = num;
        }
        return res;
    }

    //Valid Anagram
    //For anagram checking with English letters, int[26] is the optimal solution - it's faster, uses less
    //memory, and is simpler!
    public static boolean isAnagramHashSet(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            set.add(c);
        }
        for (char c : t.toCharArray()){
            if(set.add(c)){
                return false;
            }
        }

        return true;
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];

        for (char c : s.toCharArray()){
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()){
            count[c - 'a']--;
            if (count[c - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
    
}