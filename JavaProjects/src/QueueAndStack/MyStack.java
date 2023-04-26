package QueueAndStack;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<E> implements Stack<E> {
    private ArrayList<E> stack;
    private final int maxSize;
    private int top;

    public MyStack(int size) {
        this.maxSize = size;
        stack = new ArrayList<E>(size);
        //top is -1 when the stack is empty
        top = -1;
    }

    @Override
    public boolean push(E x) {
        //return false if the stack is full
        if (full()) {
            return false;
        } else {
            //add the element to the stack and increment the top
            stack.add(x);
            top++;
            return true;
        }
    }

    @Override
    public boolean pop() {
        //return false if the stack is empty
        if (empty()) {
            return false;
        } else {
            //remove the top element of the stack and decrement the top
            stack.remove(top);
            top--;
            return true;
        }
    }

    @Override
    public E top() {
        //return nothing if the stack is empty
        if (empty()) {
            return null;
        } else {
            //return the top element of the stack
            return stack.get(top);
        }
    }

    @Override
    public boolean empty() {
        //stack is empty when top is -1
        return (top == -1);
    }

    @Override
    public boolean full() {
        //stack is full when top is equal to the max size of the stack
        return (top == maxSize - 1);
    }

    @Override
    public Iterator<E> iterator() {
        //call iterator method
        return stack.iterator();
    }
}