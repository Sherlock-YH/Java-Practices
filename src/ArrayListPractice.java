import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        // 任务1：创建一个 ArrayList，添加 10, 20, 30, 40, 50
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Task 1 - Initial list: " + list);
        
        // 任务2：在索引2的位置插入元素25
        list.add(2,25);
        System.out.println("Task 2 - After inserting 25 at index 2: " + list);
        
        // 任务3：删除值为30的元素
        list.remove(Integer.valueOf(30));
        System.out.println("Task 3 - After removing value 30: " + list);
        
        // 任务4：遍历并打印所有元素（用三种不同方式）
        System.out.print("Task 4 - Method 1 (for loop): ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        System.out.print("Task 4 - Method 2 (enhanced for): ");
        for (int i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("Task 4 - Method 3 (forEach): ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        
        // 任务5：查找元素40的索引
        int index = list.indexOf(40);
        System.out.println("Task 5 - Index of element 40: " + index);
        System.out.println();
        
        // 任务6：将 ArrayList 转换为数组 int[]
        Integer[] array = list.toArray(new Integer[0]);

        for (int i : array){
            System.out.print(i + " ");
        }

        System.out.println();
        
    }
    
}
