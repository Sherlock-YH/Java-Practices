import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {

    public static void main(String[] args) {
        // ========== 作为 List 使用 ==========
        System.out.println("=== 作为 List ===");
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        // 任务1：在索引1处插入元素10
        list.add(1, 10);
        
        
        // 任务2：获取索引2的元素
        list.get(2);
        
        // 任务3：删除值为2的元素
        list.remove(Integer.valueOf(2));
        
        // ========== 作为 Queue 使用 ==========
        System.out.println("\n=== 作为 Queue (FIFO) ===");
        Queue<Integer> queue = new LinkedList<>();
        
        // 任务4：添加元素10, 20, 30到队列
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        // 任务5：查看队首元素但不移除
        System.out.println(queue.peek());
        
        // 任务6：移除并打印所有元素（按FIFO顺序）
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        
        // ========== 作为 Deque 使用 ==========
        System.out.println("\n=== 作为 Deque/Stack (LIFO) ===");
        Deque<Integer> deque = new LinkedList<>();
        
        // 任务7：当作栈使用（后进先出）
        // 压栈：1, 2, 3
        deque.push(1);
        deque.push(2);
        deque.push(3);

        
        // 弹栈并打印所有元素
        while(!deque.isEmpty()){
            System.out.println(deque.pop());
        }
        
        // 任务8：当作双端队列使用
        // 队首添加0，队尾添加4
        deque.addFirst(1);
        deque.addLast(5);
        deque.addFirst(0);
        deque.addLast(4);
        System.out.println("队首添加0,1，队尾添加4,5后: " + deque);

        // 从队首和队尾各移除一个元素
        System.out.println("移除队首元素: " + deque.removeFirst());
        System.out.println("移除队尾元素: " + deque.removeLast());
        System.out.println("移除后双端队列: " + deque);

        // 额外的演示：查看队首和队尾元素
        System.out.println("当前队首元素: " + deque.peekFirst());
        System.out.println("当前队尾元素: " + deque.peekLast());
    }
    
}
