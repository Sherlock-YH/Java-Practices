import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class MergeIntervalPractice {
	
	
//			输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
//			输出：[[1,6],[8,10],[15,18]]
//			解释：区间 [1,3] 和 [2,6] 重叠，合并为 [1,6]
//
//			输入：intervals = [[1,4],[4,5]]
//			输出：[[1,5]]
//			解释：区间 [1,4] 和 [4,5] 可被视为重叠区间
	
    public static int[][] merge(int[][] intervals) {
        // 提示：
        // 1. 先按区间起始位置排序
        // 2. 使用 List<int[]> 存储结果（因为不知道最终大小）
        // 3. 遍历合并重叠区间
    	List<int[]> result = new ArrayList<>();

        // 1. Handle edge cases
    	if (intervals == null || intervals.length <= 1) {
            return intervals; // No merging needed for null, empty, or single interval
        }

        // 2. Sort intervals by start time (essential for merging algorithm)
    	Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // a[0] - b[0] sorts ascending: negative means a < b (a comes first)

        result.add(intervals[0]);  // Add first interval as starting point

        // 3. Merge overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] lastInterval = result.get(result.size() - 1); // Get the most recent interval in result

            // Check if current interval overlaps with the last merged interval
            if (currentInterval[0] <= lastInterval[1]){
                // Overlap detected: merge by extending end time if needed
                // Note: lastInterval is a reference to the array in result, so this modifies it directl
                lastInterval[1] = Math.max(currentInterval[1], lastInterval[1]);
                // Since lastInterval is a pointer so the item in result will be modified
            }
            else{
                // No overlap: add current interval as a new entry
                result.add(currentInterval);
            }
        }
        // 4. Convert List to array for return type
        return result.toArray(new int[result.size()][]);
    }
    
    public static void main (String arg[]) {

        // 测试用例1：示例1
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result1 = merge(intervals1);
        System.out.println("测试1:" + Arrays.deepToString(intervals1));
        System.out.println("Solved: " + Arrays.deepToString(result1));
        // 期望: [[1,6],[8,10],[15,18]]

        // 测试用例2：示例2
        int[][] intervals2 = {{1,4},{4,5}};
        int[][] result2 = merge(intervals2);
        System.out.println("测试2: " + Arrays.deepToString(intervals2));
        System.out.println("Solved: " + Arrays.deepToString(result2));
        // 期望: [[1,5]]

        // 测试用例3：完全重叠
        int[][] intervals3 = {{1,4},{2,3},{5,7}};
        int[][] result3 = merge(intervals3);
        System.out.println("测试3: " + Arrays.deepToString(intervals3));
        System.out.println("Solved: " + Arrays.deepToString(result3));
        // 期望: [[1,4],[5,7]]

        // 测试用例4：一个区间包含另一个
        int[][] intervals4 = {{1,10},{2,6},{3,5},{7,9}};
        int[][] result4 = merge(intervals4);
        System.out.println("测试4: " + Arrays.deepToString(intervals4));
        System.out.println("Solved: " + Arrays.deepToString(result4));
        // 期望: [[1,10]]

        // 测试用例5：空数组
        int[][] intervals5 = {};
        int[][] result5 = merge(intervals5);
        System.out.println("测试5: " + Arrays.deepToString(intervals5));
        System.out.println("Solved: " + Arrays.deepToString(result5));
        // 期望: []

        // 测试用例6：单个区间
        int[][] intervals6 = {{1,3}};
        int[][] result6 = merge(intervals6);
        System.out.println("测试6: " + Arrays.deepToString(intervals6));
        System.out.println("Solved: " + Arrays.deepToString(result6));
        // 期望: [[1,3]]

        // 测试用例7：不连续区间
        int[][] intervals7 = {{1,2},{5,6},{8,9}};
        int[][] result7 = merge(intervals7);
        System.out.println("测试7: " + Arrays.deepToString(intervals7));
        System.out.println("Solved: " + Arrays.deepToString(result7));
        // 期望: [[1,2],[5,6],[8,9]]
    	
    }
}