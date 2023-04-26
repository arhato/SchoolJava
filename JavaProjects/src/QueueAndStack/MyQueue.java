package QueueAndStack;

import java.util.ArrayDeque;
import java.util.Iterator;

public class MyQueue<E> implements Queue<E> {

    private final int size;
    private ArrayDeque<E> queue;

    public MyQueue(int size) {
        queue = new ArrayDeque<>(size);
        this.size = size;
    }

    @Override
    public boolean join(E x) {
        //add and return true if the queue is not full
        if (!full()) {
            queue.add(x);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E top() {
        //use the getFirst method to return the first element in the queue
        return (queue.getFirst());
    }

    @Override
    public boolean leave() {
        //remove and return true if the queue is not empty
        if (empty()) {
            return false;
        } else {
            queue.removeFirst();
            return true;
        }
    }

    @Override
    public boolean full() {
        //return true if the queue size is the same as input size is full
        if (queue.size() == size) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean empty() {
        //use the isEmpty method to return true if the queue is empty
        return queue.isEmpty();
    }

    @Override
    public boolean contains(E x) {
        //use the contains method to return true if the queue contains the element
        if (queue.contains(x)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Iterator<E> iterator() {
        //use the iterator method to return the iterator
        return queue.iterator();
    }
}
