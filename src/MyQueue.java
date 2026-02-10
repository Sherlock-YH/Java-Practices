import java.util.Stack;

class MyQueue {
    // 使用两个栈：input 和 output
    private Stack<Integer> input;
    private Stack<Integer> output;
    
    /** 初始化数据结构 */
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    /** 将元素 x 推到队列的末尾 */
    public void push(int x) {
        input.push(x);
    }

    /** 从队列开头移除并返回元素 */
    public int pop() {
        if (output.isEmpty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }
    
    /** 返回队列开头的元素 */
    public int peek() {
        if (output.isEmpty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    /** 如果队列为空，返回 true */
    public boolean empty() {
        if(output.isEmpty() && input.isEmpty()){
            return true;
        }
        else return false;
    }
}