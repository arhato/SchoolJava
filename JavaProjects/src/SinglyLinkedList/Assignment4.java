package SinglyLinkedList; /**
 * Student name: Arrhat Maharjan
 *
 * Student number: 3091663
 */

import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        //Assignment5.Test code here=========================================

        //Assignment5.Test code for addTail(SinglyLinkedList.LinkedListHT lst), addHead(int x), addTail(int x) and toString()
        LinkedListHT lst1 = new LinkedListHT();
        LinkedListHT lst2 = new LinkedListHT();
        //adding variables to both objects
        for (int j = 0; j < 10; j++){
            lst1.addTail(j);
            lst2.addTail(j+1);
        }
        System.out.println("Before adding list2 to tail and 100 to head");
        System.out.println("lst1: " + lst1.toString());
        lst1.addTail(lst2);
        lst1.addHead(100);
        System.out.println("After adding list2 to tail and 100 to head");
        System.out.println("lst1: " + lst1.toString());
        //test code for toArray()
        System.out.println();
        System.out.println("Array of lst1: ");
        System.out.println(Arrays.toString(lst1.toArray()));
        //test code for sort(
        System.out.println();
        lst1.sort();
        System.out.println("After sorting lst1");
        System.out.println(lst1.toString());
        //test code for reverse()
        System.out.println();
        lst1.reverse();
        System.out.println("After reversing lst1");
        System.out.println(lst1.toString());
        //test code for delHead()
        System.out.println();
        lst1.delHead();
        System.out.println("After deleting head of lst1");
        System.out.println(lst1.toString());
        //test code for delTail()
        System.out.println();
        lst1.delTail();
        System.out.println("After deleting tail of lst1");
        System.out.println(lst1.toString());
        //test code for size()
        System.out.println();
        System.out.println("Size of lst1: " + lst1.size());
        //test code for sum()
        System.out.println();
        System.out.println("Sum of lst1: " + lst1.sum());
        //test code for count(int x)
        System.out.println();
        System.out.println("Count of occurrences of 5 in lst1: " + lst1.count(5));
        //test code for equals(Object ob)
        System.out.println();
        LinkedListHT lst3 = lst1;
        System.out.println(lst1.toString()+" equals \n"+lst2.toString()+"?: " +lst1.equals(lst2));
        System.out.println(lst1.toString()+" equals \n"+lst3.toString()+"?: " +lst1.equals(lst3));
        //======================================================
    }
}

