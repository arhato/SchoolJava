package SinglyLinkedList;

import java.util.Arrays;

class LinkedListHT {
    private Node head = null;
    private Node tail = null;

    public void addTail(LinkedListHT lst) {
        //add all elements of lst to the tail of this list
        Node current = lst.head;
        while (current != null) {
            this.addTail(current.data());
            current = current.next();
        }
    }

    public void addHead(int x) {
        //insert x at head of list
        Node nw = new Node(x);
        nw.next = head;
        head = nw;
    }

    public int[] toArray() {
        //return int array of list values
        int[] arr = new int[this.size()];
        Node current = head;
        int i = 0;
        while (current != null) {
            arr[i] = current.data();
            current = current.next();
            i++;
        }
        return arr;
    }

    public void sort() {
        //sort the list in ascending order
        int[] arr = this.toArray();
        Arrays.sort(arr);
        this.head = null;
        this.tail = null;
        for (int i = 0; i < arr.length; i++) {
            this.addTail(arr[i]);
        }
    }

    public int size() {
        //return number of nodes in the list
        Node current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next();
        }
        return length;
    }

    public void delHead() {
        //remove element at head of list
        if (head != null) {
            head = head.next();
        }
    }

    public void delTail() {
        //remove element at tail of list
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }


    public int sum() {
        //calculate sum of values in the list
        Node current = head;
        int counter = 0;
        while (current != null) {
            counter = counter + current.data();
            current = current.next();
        }
        return counter;
    }

    public int count(int x) {
        //count number of occurrences of x in list
        Node current = head;
        int counter = 0;
        while (current != null) {
            if (current.data() == x) {
                counter++;
            }
            current = current.next();
        }
        return counter;
    }

    public void reverse() {
        //reverse the list
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    public boolean equals(Object ob) {
        // method to test this list with another list for equality
        // Two lists equal if they have the same size and corresponding
        // values are equal
        boolean result = false;
        LinkedListHT temp = (LinkedListHT) ob;
        if (this.size() == temp.size()) {
            int n = size();
            if (n == temp.size()) {
                Node n1 = head;
                Node n2 = temp.head;
                while (n1 != null) {
                    if (n1.data() == n2.data()) {
                        result = true;
                    }
                    n1 = n1.next();
                    n2 = n2.next();
                }
            }
        }
        return result;
    }

    public void delAll(int x) {
        //remove all occurrences of x from the list
        Node current = head;
        while (current != null) {
            if (current.data() == x) {
                this.remove(x);
            }
            current = current.next();
        }
    }

    //empty list
    public void addTail(int x) {
        Node nw = new Node(x);
        if (head == null) {
            head = nw;
            tail = nw;
        } else {
            tail.setNext(nw);
            tail = nw;
        }
    }

    public int sumEven() {
        //calculate sum of even values in the list
        Node current = head;
        int counter = 0;
        //traverse list
        while (current != null) {
            if (current.data() % 2 == 0) { //check if the value is even
                counter += current.data(); //add up value
            }
            current = current.next();
        }
        return counter;
    }

    public boolean contains(int x) {
        Node k = head;
        boolean found = false;
        while (k != null && !found) {
            if (k.data() == x) found = true;
            else k = k.next();
        }
        return found;
    }

    public void remove(int x) {
        Node k = head;
        Node bk = head;
        boolean found = false;
        while (k != null && !found) {
            if (k.data() == x) found = true;
            else {
                bk = k;
                k = k.next();
            }
        }
        if (found) {
            if (k == head)
                head = k.next();
            else if (k == tail) {
                bk.setNext(null);
                tail = bk;
            } else
                bk.setNext(k.next());
        }
    }

    public String toString() {
        if (head == null) return "[]";
        String s = "[";
        Node k = head;
        while (k.next() != null) {
            s = s + k.data() + ", ";
            k = k.next();
        }
        s = s + k.data() + "]";
        return s;
    }

    private class Node {
        int data;
        Node next;

        public Node(int x) {
            data = x;
            next = null;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node p) {
            next = p;
        }

        public void set(int x) {
            data = x;
        }

        public int data() {
            return data;
        }
    }
}
