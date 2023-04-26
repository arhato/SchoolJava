package GenericList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        //================Test NewNumbers================
        //initialize a NewNumbers object
        System.out.println("Initial NewNumbers:");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 9; i > 1; i--) list.add(i);
        for (int i = 0; i > -10; i--) list.add(i);
        NewNumbers<Integer> n = new NewNumbers<>();
        n.add(list);
        n.print(System.out::print);
        //predicate for checking prime number
        Predicate<Integer> isPrime = x -> {
            if (x <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };
        //test for AllNumbers
        System.out.println("=================Test for AllNumbers()===================");
        //test 1
        System.out.println("Prime numbers:");
        n.forAllNumbers(isPrime);
        //test 2
        System.out.println();
        System.out.println("Odd numbers:");
        n.forAllNumbers(x -> x % 2 != 0);
        //test 3
        System.out.println("Positive numbers:");
        n.forAllNumbers(x-> x>0);

        //test for subList
        System.out.println();
        System.out.println("=================Test for subList()===================");

        //test 1
        System.out.println("Even numbers:");
        System.out.println(n.subList(x -> x % 2 == 0));
        //test 2
        System.out.println("Negative numbers:");
        System.out.println(n.subList(x -> x < 0));
        //test 3
        System.out.println("Prime numbers:");
        System.out.println(n.subList(isPrime));

        //test for mappingList
        System.out.println();
        System.out.println("=================Test for mappingList()===================");

        //test 1
        //squaring every element
        System.out.println("Squaring:");
        System.out.println(n.mappingList(x -> x * x));
        //test 2
        //doubling every element
        System.out.println("Doubling by itself:");
        System.out.println(n.mappingList(x -> x * 2));
        //test 3
        System.out.println("Divide by 2:");
        System.out.println(n.mappingList(x -> x / 2));


    }

}
