package Assignment_7;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int []arr={5, 9, 2, 9, 4, 2, 9 ,2};
        int max=max(arr);
        int maxoccor=count(arr,max);
        int maxpos=maxfirstpos(arr,max);
        int min=min(arr);
        int minoccor=count(arr,min);
        int minpos=minlastpos(arr,min);
        System.out.println("Maximun value is "+max);
        System.out.println("It occurs "+maxoccor+" time(s)");
        System.out.println("First position of maximun: "+maxpos);
        System.out.println("Minimum value is "+min);
        System.out.println("It occurs "+minoccor+" time(s)");
        System.out.println("Last position of minimum: "+minpos);





    }
    public static void readarray(int []arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter "+arr.length+" values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
    return max;

    }
    public static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        return min;

    }
    public static int maxfirstpos(int [] arr,int max){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]) {
                pos = i+1 ;
                break;
            }

        }
        return pos;
    }
    public static int minlastpos(int [] arr,int min){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(min==arr[i])
                pos=i+1;
        }
        return pos;
    }
public static int count(int []arr,int v){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==v)
                count++;
        }
        return count;
}

}
