package MergeInsertionSort;//Name: Arrhat Maharjan
//Student Number: 3091663
//MergeInsertionSort.Assignment3

public class MergeInsert {
    public static void main(String[] args) {

        // create an object
        MergeInsert obj = new MergeInsert();

        //System.out.print("Before: ");		printArray(?);
        obj.testSpeed(10);
//        System.out.print("After: ");		printArray();

        //printArray(arr);
        obj.testSpeed(99);
        //System.out.print("After: ");		printArray(?);

        //printArray(arr);
        obj.testSpeed(100);
        //System.out.print("After: ");		printArray(?);

        //printArray(arr);
        obj.testSpeed(101);
        //System.out.print("After: ");		printArray(?);

        //printArray(arr);
        obj.testSpeed(500);
        //System.out.print("After: ");		printArray(?);

        //printArray(arr);
        obj.testSpeed(5000);
        //System.out.print("After: ");		printArray(?);
    }

    public static void mergeInsertSort(int[] arr, int bottom, int top) {
        if (top - bottom <= 100) {
            insertionSort(arr, bottom, top);
        } else {
            int mid = (bottom + top) / 2;
            mergeInsertSort(arr, bottom, mid);
            mergeInsertSort(arr, mid, top);
            insertionSort(arr, bottom, mid);
            insertionSort(arr, mid, top);
            merge(arr, bottom, mid, top);
        }
    }


    public static void merge(int[] arr, int bottom, int middle, int top) {

        //lo<=mid<=hi
        int loCount = bottom;
        int hiCount = middle;
        //use temp array to store merged sub-sequence
        int[] temp = new int[top - bottom];
        int t = 0;
        while (loCount < middle && hiCount < top) {
            if (arr[loCount] <= arr[hiCount]) {
                temp[t] = arr[loCount];
                loCount++;
                t++;
            } else {
                temp[t] = arr[hiCount];
                hiCount++;
                t++;
            }
        }
        while (loCount < middle) {
            temp[t] = arr[loCount];
            loCount++;
            t++;
        }
        while (hiCount < top) {
            temp[t] = arr[hiCount];
            hiCount++;
            t++;
        }
        int i = bottom;
        t = 0;
        while (t < temp.length) {
            arr[i] = temp[t];
            i++;
            t++;
        }
    }

    public static void insertionSort(int[] arr, int bottom, int top) {
//        for (int i = bottom ; i <= top; i++){
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= bottom && arr[j] > key){
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
        int j = bottom + 1;
        while (j < top) {
            int i = j;
            while (i > 0 && arr[i] < arr[i - 1]) { //swap f[i], f[i-1]
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
            j++;
        }

    }

    public int[] createArray(int numElements) {
        int[] newArray = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            newArray[i] = (int) (Math.random() * ((100 - 1 + 1) + 1));
        }
        return newArray;
    }

    void testSpeed(int size) {
        int[] testArray = createArray(size);
        long start = System.nanoTime(); // nano time function
        mergeInsertSort(testArray, 0, testArray.length);
        long end = System.nanoTime(); //nano time function
        long timeToRun = end - start; // calculate runtime
        System.out.println("Time in nanoseconds for array size " + size + ": " + timeToRun);

        checkSort(testArray); // If array is not sorted it will print an error

        printArray(testArray);

    }

    public void checkSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println();
                System.out.printf("!!!!! Array is not sorted, value at index %d is bigger than the next value\n", i);
                System.out.println();
                break;
            }
        }
    }

    public void printArray(int[] myArray) {
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + " ");
        }
        System.out.println();
    }

}
