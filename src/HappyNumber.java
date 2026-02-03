import java.util.*;

public class HappyNumber {

//     输入：19
// 输出：true
// 解释：
// 1² + 9² = 82
// 8² + 2² = 68
// 6² + 8² = 100
// 1² + 0² + 0² = 1  // 变成 1，是快乐数

// 输入：2
// 输出：false


    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("Input = " + n);

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNextNumber(n);
            System.out.println("Sum = " + n);
        }

        return n == 1;
    }

    private static int getNextNumber(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args){
        int t1 = 24;
        int t2 = 36;
        int t3 = 19;

        System.out.println(isHappy(7));
    }
    
}
