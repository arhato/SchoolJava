package SimpleRecursion;

public class Frequency {
    public static void main(String[] args) {
        //initiate the array
        int[] arr={1,3,2,76,6,5,56,45,9,0,56,0,5,5,0,8,0,6,0};
        //call method
        System.out.println(frequency(arr,0));
    }
    public static int frequency(int[] arr, int index){
        //base case
        if (arr.length == index){return 0;}
        //recursive
        int count= frequency(arr,index+1);
        //check if the element is 0
	    if (arr[index]==0){
            //if it is 0, add 1 to the count
            count++;
        }
        //return the count
        return count;
    }
}

