package Assignment_7;
import java.util.*;

public class  Q9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double []arr=new double [10];
        System.out.println("Enter 10 values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }
        System.out.print("Original array: ");
        print(arr);
        System.out.println();
        System.out.print("Sorted array:");
        bubbleSort(arr);
        print(arr);


    }
//    public static void bubbleSort(double[] arr){
//        boolean swap;
//        for(int i=0;i<arr.length-1;i++){
//            swap=false;
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]) {
//
//
//
//                    double t = arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=t;
//                    swap=true;
//                }
//            }if(!swap) break; // if not swap then it was allready sorted
//        }
//    }
    public static void print(double [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    public static void bubbleSort(double[] arr){
        for (int i=0;i<arr.length;i++) {


            for (int j = 0; j < arr.length -i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }

            }
        }
    }

}
