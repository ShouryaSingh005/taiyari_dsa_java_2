package Assignment_7;

public class Q15 {
    public static void main(String[] args) {
        int [] arr={1,8,0,9,5,4,0,8,5,0};
        System.out.println("Original Array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        moveZERO(arr);
        System.out.println("Modified Array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
    public static void moveZERO(int []arr){
        int[] result=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                result[index]=arr[i];
                index++;
            }
        }
        // here the result array contains the required array here now we can either return the result array
        // or we can make the original array i.e arr a deep copy of result array
        // either;
        // return result;
        //or
        for(int i =0;i<arr.length;i++){
            arr[i]=result[i];
        }

    }
}
