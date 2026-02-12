package Assignment_7;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {

        int[] count=new int[101];// so that it include the index 1 to 100
        readinput(count);
        displaycount(count);



    }
    public static void readinput(int[] count){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter int b/w 1 to 100 (0 to stop): ");
        while(true){
            int n=sc.nextInt();
            if(n==0) break;
            if(n>=1 && n<=100){
                count[n]++;
            }
            else System.out.println("invalid input");
        }

    }
    public static void displaycount(int [] count){
        for(int i=1;i<count.length;i++){
            if(count[i]>0){
                System.out.println("The number "+i+" occors "+count[i]+" times");


        }
        }


    }

}
