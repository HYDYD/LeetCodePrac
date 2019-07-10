package primary.interfaces;

/**
 * Created by HYDYD.
 * 2019/6/19 21:22
 */

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 */
public class MinStack {
    private int[] stack;
    private int size;
    private int min = 0;//记录最小值
    /** initialize your data structure here. */
    public MinStack() {
        stack = new int[1000];
        size = -1;
    }

    public void push(int x) {
        if (size + 1 >= stack.length){
            stack = addLength(size * 2);
        }

        stack[++size] = x;

        if(stack[min] > stack[size]){
            min = size;
        }
    }

    public int[] addLength(int length){
        int[] temp = new int[length];
        for (int x = 0; x <= size; x++){
            temp[x] = stack[x];
        }
        return temp;
    }

    public void pop() {
        --size;
        if (size + 1 == min && size <= 0){
            min = 0;
        } else if (size + 1 == min){
            min = size;
            for (int x = 0 ; x < size; x++){
                if (stack[min] > stack[x])
                    min = x;
            }
        }
    }

    public int top() {
        return size < 0 ? stack[0] : stack[size];
    }

    public int getMin() {
        return stack[min];
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
