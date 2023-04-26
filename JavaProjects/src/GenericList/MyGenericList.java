package GenericList;/*
 * Name: Arrhat Maharjan
 * Student ID: 3091663
 *
 */

import java.util.*;

public class MyGenericList<E> implements Iterable<E> {

    //instance variables
    private ArrayList<E> list;
    private int size = 0;

    //constructor
    public MyGenericList() {
        //create a new ArrayList
        list = new ArrayList<>();
    }

    public void add(E x) {
        //add x to the list if x is not null
        if (x != null) {
            list.add(x);
            //increment size
            size++;
        }
    }

    public E get(int index) {
        //return the element at index
        return list.get(index);
    }

    public void remove(int index) {
        //remove the element at index
        list.remove(index);
        //decrement size
        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        //clear the list
        list.clear();
        //set size to 0
        size = 0;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(E x) {
        return list.contains(x);
    }

    public int indexOf(E x) {
        return list.indexOf(x);
    }

    public void addAll(List<E> l) {
        //add all elements of l to the list
        list.addAll(l);
        //add the size of the parameter
        size += list.size();
    }

    public E[] toArray(E[] a) {
        return list.toArray(a);
    }

    public void sort(Comparator<? super E> c) {
        list.sort(c);
    }

    public String toString() {
        return list.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

}
