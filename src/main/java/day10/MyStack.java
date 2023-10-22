package day10;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {

    Deque<Integer> deque;


    public MyStack() {
        deque = new ArrayDeque<>();
    }

    public void push(int x) {
        deque.addFirst(x);
    }

    public int pop() {
        return deque.removeFirst();
    }

    public int top() {
        return deque.getFirst();
    }

    public boolean empty() {
        return deque.isEmpty();
    }

}
