package HashMap;

import java.util.Random;

/**
 * student name: Arrhat Maharjan
 * student number: 3091663
 */

public class QuestionOneTest {
    public static void main(String[] args) {
        //initialize new MyHashList of Point3D type
        //500 seems to be the optimal number to have no empty buckets and
        //not have buckets with high number of elements
        MyHashList<Point3D> hashList = new MyHashList<>(500);
        Random rand = new Random();
        //add Point3D objects
        for (int i = 0; i < 10000; i++) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            int z = rand.nextInt(100);
            Point3D point = new Point3D(x, y, z);
            hashList.add(point);
        }
        //display information
        System.out.println("Percentage of buckets used: " + hashList.percentUsed());
        System.out.println("Largest bucket size: " + hashList.largestBucket());
        System.out.println("Smallest bucket size: " + hashList.smallestBucket());
        int[] bucketSizes = hashList.listSizes();
        System.out.println("Frequency list:");
        int total = 0;
        System.out.println("| Buckets with x elements | Frequency |");
        System.out.println("|-------------------------|-----------|");
        for (int i = 0; i < bucketSizes.length; i++) {
            if (bucketSizes[i] > 0) {
                total = total + (i * bucketSizes[i]);
                System.out.printf("|  %d elements \t \t\t  | %d  |\n", i, bucketSizes[i]);
            }
        }
        System.out.println("|------------------------|-----------|");
        System.out.printf("| Total                  | %d     |\n", total);
        System.out.printf("| Empty                  | %d         |\n", hashList.empty());

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Experiment with 1000: ");
        //initialize new MyHashList of Point3D type
        //1000 makes buckets have more elements than 500
        MyHashList<Point3D> hashList2 = new MyHashList<>(1000);
        //add Point3D objects
        for (int i = 0; i < 10000; i++) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            int z = rand.nextInt(100);
            Point3D point = new Point3D(x, y, z);
            hashList2.add(point);
        }
        //display information
        int[] bucketSizes2 = hashList2.listSizes();
        System.out.println("Frequency list:");
        int total2 = 0;
        System.out.println("| Buckets with x elements | Frequency |");
        System.out.println("|-------------------------|-----------|");
        for (int i = 0; i < bucketSizes2.length; i++) {
            if (bucketSizes2[i] > 0) {
                total2 = total2 + (i * bucketSizes2[i]);
                System.out.printf("|  %d elements \t \t\t  | %d  |\n", i, bucketSizes2[i]);
            }
        }
        System.out.println("|------------------------|-----------|");
        System.out.printf("| Total                  | %d     |\n", total2);
        System.out.printf("| Empty                  | %d         |\n", hashList2.empty());

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Experiment with 1500: ");
        //initialize new MyHashList of Point3D type
        //1000 makes buckets have fewer elements than 500
        MyHashList<Point3D> hashList3 = new MyHashList<>(1000);
        //add Point3D objects
        for (int i = 0; i < 10000; i++) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            int z = rand.nextInt(100);
            Point3D point = new Point3D(x, y, z);
            hashList3.add(point);
        }
        //display information
        int[] bucketSizes3 = hashList3.listSizes();
        System.out.println("Frequency list:");
        int total3 = 0;
        System.out.println("| Buckets with x elements | Frequency |");
        System.out.println("|-------------------------|-----------|");
        for (int i = 0; i < bucketSizes3.length; i++) {
            if (bucketSizes3[i] > 0) {
                total3 = total3 + (i * bucketSizes3[i]);
                System.out.printf("|  %d elements \t \t\t  | %d  |\n", i, bucketSizes3[i]);
            }
        }
        System.out.println("|------------------------|-----------|");
        System.out.printf("| Total                  | %d     |\n", total3);
        System.out.printf("| Empty                  | %d         |\n", hashList3.empty());
    }
}
