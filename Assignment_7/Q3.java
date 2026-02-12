package Assignment_7;
import java.util.Scanner;


public class Q3 {
    public static void readarray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 int: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[10];
        readarray(arr);
        System.out.print("Enter the number to search: ");
        int a=sc.nextInt();
        int c=countoccorance(arr,a);
        System.out.println("The number "+a+" occors "+c+" time(s)");

    }
    public static int countoccorance(int []arr,int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }

}
