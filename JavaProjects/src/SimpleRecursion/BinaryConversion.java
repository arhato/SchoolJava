package SimpleRecursion;

public class BinaryConversion {
    public static void main(String[] args) {
        //call method
        binary(11);
    }
    public static void binary(int num){
        //base case
        if (num/2 ==0){
            System.out.print(num%2);
        }else{
            //recursive case
            binary(num/2);
            System.out.print(num%2);
        }
    }
}
