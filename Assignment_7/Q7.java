package Assignment_7;

public class Q7 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // we want {10,1,2,3,4,5,6,7,8,9}
        rev(arr,0,arr.length-2);// rotate 1 to 9
        // now rotate whole
        rev(arr,0,arr.length-1);
        for(int ele:arr){
            System.out.print(ele);
        }


    }
    public static void rev(int[] arr,int i,int j){

        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }


    }
}