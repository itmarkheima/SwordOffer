package study;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    

    public MyQueue() {
        stackIn=new Stack<>();
        stackOut=new Stack<>();
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        if (!stackOut.empty()){
            return stackOut.pop();
        }
        while (!stackIn.empty()){
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }
    
    public int peek() {
        if (!stackOut.empty()){
            return stackOut.peek();
        }
        while (!stackOut.empty()){
            stackOut.push(stackIn.pop());
        }
        return stackOut.peek();
    }
    
    public boolean empty() {
        return stackOut.empty()&& stackIn.empty();
    }
}