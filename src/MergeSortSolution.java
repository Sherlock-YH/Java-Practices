
class MergeSortSolution {

// 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// 输出：[1,2,2,3,5,6]
// 解释：合并后数组是 [1,2,2,3,5,6]



    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从后往前合并，避免频繁移动元素
        int i = m - 1; // nums1有效部分的最后一个索引
        int j = n - 1; // nums2的最后一个索引
        int k = m + n - 1; // nums1的最后一个位置
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        
        // 如果nums2还有剩余元素
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        // 如果nums1还有剩余元素，它们已经在正确的位置上
    }

    public static void main (String arg[]){
        // 测试用例1
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.print("测试用例1结果: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 测试用例2: nums2为空
        int[] nums3 = new int[] {1};
        int[] nums4 = new int[] {};
        merge(nums3, 1, nums4, 0);
        System.out.print("测试用例2结果: ");
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 测试用例3: nums1为空
        int[] nums5 = new int[] {0};
        int[] nums6 = new int[] {1};
        merge(nums5, 0, nums6, 1);
        System.out.print("测试用例3结果: ");
        for (int num : nums5) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 测试用例4: 两个数组都有多个元素
        int[] nums7 = new int[] {1,4,7,0,0,0};
        int[] nums8 = new int[] {1,2,3};
        merge(nums7, 3, nums8, 3);
        System.out.print("测试用例4结果: ");
        for (int num : nums7) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}