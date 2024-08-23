import java.util.Stack;

public class QueueUSingStack {
    public static class MyQueue{

        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public MyQueue() {
        stack1 = new Stack<>();
        stack2= new Stack<>();
        }
        public void push(int x) {
            stack1.push(x);

        }

        public int pop() {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

        public int peek() {
            return stack2.peek();
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.empty() ;

        }
    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.push(1);
        mq.push(2);

        System.out.println(mq.pop());
        System.out.println(mq.peek());
        System.out.println(mq.empty());
    }
}
