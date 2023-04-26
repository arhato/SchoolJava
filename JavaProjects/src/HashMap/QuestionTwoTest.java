package HashMap;
/*
 * student name: Arrhat Maharjan
 * student number: 3091663
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class QuestionTwoTest {
    public static void main(String[] args) {
        //initialize a MyHashList of size 10
        MyHashList<Integer> integerList = new MyHashList<>(10);
        Random rand = new Random();
        //add values
        for (int i = 0; i < 100; i++) {
            //add numbers in range of 1 to 10 inclusive
            integerList.add(rand.nextInt(10) + 1);
        }
        // Get the list with the value same as 5
        System.out.println("List of integers: ");
        //invoke getList(E x method)
        System.out.println(integerList.getList(5));

        System.out.println();
        // Remove an element
        //initialize list with items to remove
        List<Integer> removeList = new ArrayList<>();
        //will be removing 1, 3, 7 and 9
        removeList.add(1);
        removeList.add(3);
        removeList.add(7);
        removeList.add(9);
        //invoke remove(List<E> ls) method
        integerList.remove(removeList);
        System.out.println("List of integers after removing 1, 3, 7,and 9: ");
        //print list
        System.out.println(integerList);

        // Get elements that satisfy a predicate
        // for even numbers
        Predicate<Integer> predicate = x -> x % 2 == 0;
        //invoke get(Predicate) method
        List<Integer> filteredList = integerList.get(predicate);
        System.out.println();
        System.out.println("List of integers greater than 7: ");
        System.out.println(filteredList);
    }
}
