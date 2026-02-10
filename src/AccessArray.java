import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AccessArray {
    public static void main(String arg[]){
        List<Integer> list = new ArrayList<>();


list.add(1);
list.add(2);
list.add(3);
list.add(4);

// 方式1：for循环（随机访问）
for (int i = 0; i < list.size(); i++) {
    Integer num = list.get(i);  // O(1)
}

// 方式2：增强for循环（迭代器）
for (Integer num : list) {
    // 使用迭代器，适合所有List实现
}

// 方式3：forEach + lambda（Java 8）
list.forEach(num -> System.out.println(num));

// 方式4：显式迭代器
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
    Integer num = it.next();
    System.out.println(num);
    // if (需要删除) {
    //     it.remove();  // 唯一安全的遍历时删除方式
    // }
}
    }
}
