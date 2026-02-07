import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // 每一行的第一个和最后一个元素都是 1
    // 其他元素：row[i] = prevRow[i-1] + prevRow[i]
    // 注意 Java 中 List 的嵌套使用

    public static List<List<Integer>> generate(int numRows) {
        // 提示：使用 List<List<Integer>> 存储结果
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0 ; i < numRows; i++){
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    List<Integer> prevRow = result.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            result.add(row);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // 测试生成5行杨辉三角
        List<List<Integer>> triangle = generate(5);
        
        System.out.println("杨辉三角（5行）：");
        for (int i = 0; i < triangle.size(); i++) {
            // 打印缩进，使三角形居中
            for (int j = 0; j < triangle.size() - i - 1; j++) {
                System.out.print("  ");
            }
            
            // 打印当前行的数字
            List<Integer> row = triangle.get(i);
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
        
        // 测试生成1行
        System.out.println("\n杨辉三角（1行）：");
        List<List<Integer>> triangle1 = generate(1);
        System.out.println(triangle1);
        
        // 测试生成0行
        System.out.println("\n杨辉三角（0行）：");
        List<List<Integer>> triangle0 = generate(0);
        System.out.println(triangle0);
    }
}



