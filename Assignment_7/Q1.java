package Assignment_7;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Random values stored in the array is: ");
        for(int i=0;i<n;i++){
            arr[i]=r.nextInt(30)+1;
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        int s=sum(arr);
        double a=avg(arr);
        System.out.println("sum= "+s);
        System.out.println("avg= "+a);

    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static double avg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }

}
