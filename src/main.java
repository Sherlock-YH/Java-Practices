import java.util.*;

public class main {

    /**
     * Finds two indices such that nums[i] + nums[j] == target
     * @param nums   input array of integers
     * @param target target sum
     * @return array containing the two indices
     */
    public static int[] twoSum(int[] nums, int target) {

        // ==============================
        // ✏️ YOUR CODE STARTS HERE
        // ==============================
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		int current = nums[i];
    		int complement = target - current;
    		
    		if (map.containsKey(complement)) {
    			return new int[] {map.get(complement), i};
    		}
    		
    		map.put(current, i);
    	}
    	
    	//If no solution it will return -1 -1
    	return new int[] {-1, -1}; 
        // ==============================
        // ✏️ YOUR CODE ENDS HERE
        // ==============================

    }

    // Method to help display results
    public static void runTest(int[] nums, int target) {
        int[] result = twoSum(nums, target);
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Output Indices: " + Arrays.toString(result));
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        // 🧪 Test Case 1
        runTest(new int[]{2, 7, 11, 15}, 9);
        // Expected: [0, 1]

        // 🧪 Test Case 2
        runTest(new int[]{3, 2, 4}, 6);
        // Expected: [1, 2]

        // 🧪 Test Case 3
        runTest(new int[]{3, 3}, 6);
        // Expected: [0, 1]

        // 🧪 Test Case 4
        runTest(new int[]{1, 5, 8, 10, 13}, 18);
        // Expected: [2, 3]

        // 🧪 Test Case 5
        runTest(new int[]{-3, 4, 3, 90}, 0);
        // Expected: [0, 2]
    }
}
