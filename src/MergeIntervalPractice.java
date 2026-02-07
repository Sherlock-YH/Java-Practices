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
	
    public int[][] merge(int[][] intervals) {
        // 提示：
        // 1. 先按区间起始位置排序
        // 2. 使用 List<int[]> 存储结果（因为不知道最终大小）
        // 3. 遍历合并重叠区间
    	List<int[]> result = new ArrayList<>();
    	
    	if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
    	Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        
        int[] resultArr = result.toArray(new Integer[0][0]);
        return resultArr;
    }
    
    public static void main (String arg[]) {
    	
    	
    	
    }
}