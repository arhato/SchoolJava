package SimpleRecursion;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the numbers with -1 ending.");
        //call method
        multipleThree(in);
    }
    public static void multipleThree(Scanner in) {
        //get input
        int n=in.nextInt();
        //base case
        if(n==-1) {return;}
        //recursive case
        if(n%3==0) {
            System.out.println(n);
        }
        multipleThree(in);
    }
}
