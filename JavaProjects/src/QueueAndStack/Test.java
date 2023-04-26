package QueueAndStack;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //===========|Assignment5.Test for MyStack|=====================
        System.out.println("===========|Assignment5.Test for MyStack|=====================");
        MyStack<String> stack = new MyStack<>(5);
        //test for empty()
        System.out.println("Is the stack empty? " + stack.empty());
        //push 5 elements to the stack
        System.out.println("Pushing 5 elements to the stack...");
        stack.push("Adam");
        stack.push("Aileen");
        stack.push("Bella");
        stack.push("Bobby");
        stack.push("Cindy");
        //test for full()
        System.out.println("Is the stack full? " + stack.full());
        //test for top()
        System.out.println("The top element of the stack is: " + stack.top());
        //test for iterator()
        System.out.println("The elements of the stack before pop() are: ");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //test for pop(); removes the last element added;[Cindy]
        stack.pop();
        Iterator<String> iterator2 = stack.iterator();
        System.out.println("The elements of the stack after pop() are: ");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


        //================|Assignment5.Test for MyQueue|================
        System.out.println("===========|Assignment5.Test for MyQueue|=====================");
        MyQueue<String> queue = new MyQueue<>(5);
        //test for empty()
        System.out.println("Is the queue empty? " + queue.empty());
        //test for join()
        System.out.println("Joining 5 elements to the queue...");
        queue.join("Adam");
        queue.join("Aileen");
        queue.join("Bella");
        queue.join("Bobby");
        queue.join("Cindy");
        //test for full()
        System.out.println("Is the queue full? " + queue.full());
        //test for top()
        System.out.println("The top element of the queue is: " + queue.top());
        //test for iterator()
        System.out.println("The elements of the queue before leave() are: ");
        Iterator<String> iterator3 = queue.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        //test for leave(); removes the first element added ; [Adam]
        queue.leave();
        Iterator<String> iterator4 = queue.iterator();
        System.out.println("The elements of the queue after leave() are: ");
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }
        //test for contains()
        System.out.println("Does the queue contain 'Adam'? " + queue.contains("Adam"));
        System.out.println("Does the queue contain 'Bella'? " + queue.contains("Bella"));
    }
}
