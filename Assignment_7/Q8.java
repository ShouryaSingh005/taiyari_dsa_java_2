package Assignment_7;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int [] arr=new int[10];
        fillArray(arr);
        printArray(arr);
        System.out.print("The number of prime numbers in the array is: "+countPrimes(arr));



    }
    public static void fillArray(int[] arr){
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(28) + 2;
        }

    }
    public static void printArray(int[] arr){
        System.out.print("Array elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
    }
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;

        } return true;
    }
    public static int countPrimes(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i]))
                count++;
        }
        return count;
    }
}