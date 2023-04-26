package GenericList;/*
 * Name: Arrhat Maharjan
 * Student ID: 3091663
 *
 */

import java.util.*;
import java.util.function.*;

class NewNumbers<E> implements Iterable<E> {
    //instance variable
    private List<E> data = new LinkedList<>();

    public void add(E x) {
        //add x to the list if x is not null
        if (x != null) data.add(x);
    }

    public void add(List<E> ls) {
        //add all elements of ls to the list id parameter is not null
        if (ls == null) return;
        data.addAll(ls);
    }

    public boolean contains(Predicate<E> pr) {
        //return true if the list contains an element that satisfies the predicate
        for (E x : data) if (pr.test(x)) return true;
        return false;
    }

    public List<E> filterList(Predicate<E> pr) {
        //temporary list
        List<E> tmp = new LinkedList<>();
        //add all elements that satisfy the predicate to the temporary list
        for (E x : data) if (pr.test(x)) tmp.add(x);
        //return the temporary list
        return tmp;
    }

    public void remove(Predicate<E> pr) {
        //remove all elements that satisfy the predicate
        data.removeIf(pr);
    }

    public void print(Consumer<E> cn) {
        //print all elements of the list using the consumer
        for (E x : data) {
            cn.accept(x);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void forAllNumbers(Predicate<Integer> pr) {
        //print all elements of the list that satisfy the predicate
        for (E x : data) {
            if (pr.test((Integer) x)) {
                System.out.print(x + " ");
            }
        }
    }

    public List<Integer> subList(Predicate<Integer> pr) {
        //temporary list
        List<Integer> tmp = new LinkedList<>();
        //add all elements that satisfy the predicate to the temporary list
        for (E x : data) if (pr.test((Integer) x)) tmp.add((Integer) x);
        //return the temporary list
        return tmp;
    }

    public List<Integer> mappingList(Function<Integer, Integer> f) {
        //temporary list
        List<Integer> tmp = new LinkedList<>();
        //add all elements that satisfy the predicate to the temporary list
        for (E x : data) tmp.add((Integer) f.apply((Integer) x));
        //return the temporary list
        return tmp;
    }

    public Iterator<E> iterator() {
        //return an iterator
        return data.iterator();
    }
}