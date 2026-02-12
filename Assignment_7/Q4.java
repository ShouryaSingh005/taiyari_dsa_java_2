package Assignment_7;
import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter 10 number: ");
        double [] arr=new double[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }
        double m=min(arr);
        System.out.println("The minimun value is "+m);
    }
    public static double min(double[] arr){
        double min=Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
