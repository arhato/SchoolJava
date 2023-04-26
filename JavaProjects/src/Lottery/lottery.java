package Lottery;

import java.util.Random;
import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in);

        //_____________________________________
        //part number 1
        //finished

        int[] numArray = new int[10]; //defining array for random numbers
        int sum = 0;
        int max = 99;
        int min = 1;
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = rand.nextInt((max - min) + 1);
            boolean duplicate = true;
            while (duplicate) {
                duplicate = false; //immediate change to false so exit loop if the condition is false
                for (int j = 0; j < i; j++) {
                    if (numArray[i] == numArray[j]) {
                        duplicate = true;
                        break; //break loop to get another number
                    }
                }
                if (duplicate) {
                    numArray[i] = rand.nextInt((max - min) + 1); //new number if a number repeats is true
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + numArray[i]; //adding value to sum
            if (numArray[i] < 10) {
                System.out.print("0" + numArray[i] + " "); //adding 0 in-front of single digit numbers
            } else {
                System.out.print(numArray[i] + " "); //adding space between numbers
            }
        }
        System.out.println();
        System.out.println("The sum of the winning numbers are " + sum);

        //_____________________________________
        //part number 2
        //finished

        System.out.println("You can win either €1000 or €200 or €50 or €20 or €10");
        System.out.println("If any one of those appear more than once");
        int[] bonus = {0, 0, 0, 0, 0}; //initialize the array
        int chance;
        for (int i = 0; i < 4; i++) {
            chance = rand.nextInt(100 + 1);
            if (chance > 0 & chance <= 2) {
                System.out.println("€1000");
                bonus[0] = bonus[0] + 1; //assigning value memory 0 as prize for 1000
            } else if (chance > 2 & chance <= 8) {
                System.out.println("€200");
                bonus[1] = bonus[1] + 1; //assigning value memory 1 as prize for 200
            } else if (chance > 8 & chance < 23) {
                System.out.println("€50");
                bonus[2] = bonus[2] + 1; //assigning value memory 2 as prize for 50
            } else if (chance >= 23 & chance < 50) {
                System.out.println("€20");
                bonus[3] = bonus[3] + 1; //assigning value memory 3 as prize for 20
            } else if (chance > 50) {
                System.out.println("€10");
                bonus[4] = bonus[4] + 1; //assigning value memory 4 as prize for 10
            }
        }

        int bonusPrize = 0;
        for (int i = 0; i < bonus.length; i++) {
            if (bonus[i] >= 2) {
                switch (i) {
                    case 0:
                        System.out.println("You've won €1000 bonus! Congratulations!");
                        bonusPrize = bonusPrize + 1000; //assigning value to bonus prize to late add to main prize
                        break;
                    case 1:
                        System.out.println("You've won €200 bonus! Congratulations!");
                        bonusPrize = bonusPrize + 200;
                        break;
                    case 2:
                        System.out.println("You've won €50 bonus! Congratulations!");
                        bonusPrize = bonusPrize + 50;
                        break;
                    case 3:
                        System.out.println("You've won €20 bonus! Congratulations!");
                        bonusPrize = bonusPrize + 20;
                        break;
                    case 4:
                        System.out.println("You've won €10 bonus! Congratulations!");
                        bonusPrize = bonusPrize + 10;
                        break;
                }
            }
        }

        //_____________________________________
        //part number 3
        //finished

        System.out.println("Please enter 5 numbers between 1 and 99");
        int[] inputArray = new int[5];
        int sumGuessed;
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = myObj.nextInt();
            boolean repeatNum = true;
            while (repeatNum) {
                repeatNum = false; //immediate change to false so exit loop if the condition is false
                for (int j = 0; j < i; j++) {
                    if (inputArray[i] == inputArray[j]) {
                        repeatNum = true;
                        System.out.println("Please enter another number");
                        break;
                    }
                }
                if (repeatNum) {
                    inputArray[i] = myObj.nextInt(); //new number if a same number is repeated
                }

            }
        }

        System.out.println("What do you think the sum of the ten numbers is?");
        sumGuessed = myObj.nextInt();

        //_____________________________________
        //part number 4
        //finished

        System.out.println("Calculating your winnings...");
        int numMatch = 0;
        for (int k : inputArray) {
            for (int i : numArray) {
                if (k == i) { // all 10 numbers are compared to the 5 guessed numbers
                    numMatch = numMatch + 1; // increase in matched number
                }
            }
        }
        int win1 = 0; //win1 for prize by guessing correct number
        if (numMatch == 1) {
            win1 = 1000;
        } else if (numMatch == 2) {
            win1 = 6000;
        } else if (numMatch == 3) {
            win1 = 25000;
        } else if (numMatch == 4) {
            win1 = 100000;
        } else if (numMatch >= 5) {
            win1 = 800000;
        }

        //_____________________________________
        //part number 5
        //finished
        int win2 = 0; //win2 for prize by guessing correct sum
        if (sumGuessed == sum) {
            win2 = 300000;
        }
        //_____________________________________
        //part number 6
        //finished

        int win = Math.max(win2, win1); //compare 2 winnings
        win = win + bonusPrize; //store correct winning
        System.out.println("Congratulations you have won €" + win + "!!!"); //present total winning
    }
}












