import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // 使用 Queue 进行 BFS
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
    
    
    // 测试方法
    public static void main(String[] args) {
        // 测试用例1：示例中的二叉树 [3,9,20,null,null,15,7]
        System.out.println("测试用例1:");
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        
        List<List<Integer>> result1 = levelOrder(root1);
        System.out.println("预期: [[3], [9, 20], [15, 7]]");
        System.out.println("实际: " + result1);
        System.out.println();
        
        // 测试用例2：空树
        System.out.println("测试用例2:");
        TreeNode root2 = null;
        List<List<Integer>> result2 = levelOrder(root2);
        System.out.println("预期: []");
        System.out.println("实际: " + result2);
        System.out.println();
        
        // 测试用例3：只有一个节点
        System.out.println("测试用例3:");
        TreeNode root3 = new TreeNode(1);
        List<List<Integer>> result3 = levelOrder(root3);
        System.out.println("预期: [[1]]");
        System.out.println("实际: " + result3);
        System.out.println();
        
        // 测试用例4：完全二叉树 [1,2,3,4,5,6,7]
        System.out.println("测试用例4:");
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.right.left = new TreeNode(6);
        root4.right.right = new TreeNode(7);
        
        List<List<Integer>> result4 = levelOrder(root4);
        System.out.println("预期: [[1], [2, 3], [4, 5, 6, 7]]");
        System.out.println("实际: " + result4);
        System.out.println();
        
        // 测试用例5：只有左子树的树 [1,2,null,3]
        System.out.println("测试用例5:");
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.left.left = new TreeNode(3);
        
        List<List<Integer>> result5 = levelOrder(root5);
        System.out.println("预期: [[1], [2], [3]]");
        System.out.println("实际: " + result5);
        System.out.println();
        
        // 测试用例6：不平衡二叉树 [1,2,3,4,null,null,5]
        System.out.println("测试用例6:");
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.right = new TreeNode(3);
        root6.left.left = new TreeNode(4);
        root6.right.right = new TreeNode(5);
        
        List<List<Integer>> result6 = levelOrder(root6);
        System.out.println("预期: [[1], [2, 3], [4, 5]]");
        System.out.println("实际: " + result6);
    }
}