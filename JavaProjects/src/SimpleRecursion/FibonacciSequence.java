package SimpleRecursion;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        //initiate array
        int[] f = new int[n];
        //call method
        fibSequence(0, n, f);
        //print the array
        for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }
        sc.close();
    }
    static int fibSequence(int i, int n, int[] f) {
        if (i == 0) {
            f[i] = 0;
            return fibSequence(i + 1, n, f);
        }else if(i == 1) {
            f[i] = 1;
            return fibSequence(i + 1, n, f);
        }else if(i < n) {
            f[i] = f[i - 1] + f[i - 2];
            return fibSequence(i + 1, n, f);
        } else {
            return 0;
        }
    }
}

