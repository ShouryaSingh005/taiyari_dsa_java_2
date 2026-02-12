package Assignment_7;

public class Q10_learn {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1,5,4,3,2};
        for(int ele:elemenatedublicate(arr)){
            System.out.print(ele+" ");
        }


    }
    public static int[] elemenatedublicate(int[] arr){
        int[] temp=new int[arr.length];
        int size=0;
        boolean found;
        for(int i=0;i<arr.length;i++){
            found=false;
            for(int j=0;j<size;j++){
                if(arr[i]==temp[j])
                    found=true;

            }
            if(!found){
                temp[size]=arr[i];
                size++;
            }

        }
        int[] distint=new int[size];
        for(int i =0;i<size;i++){
            distint[i]=temp[i];
        }
        return distint;
    }


}
