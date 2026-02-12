package Assignment_7;

public class Q5 {

        // pehle maximum nikalo phir us maximum ko hta k again maximum nikalo...
        public static void main(String[] args) {
        int[] arr1 = {2, 4, 55, 43, 87, 90, 90, 12, 33, 4, 32};
        max2nd(arr1);


    }

        public static int max2nd(int[] arr) {
        int max =Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max2 < arr[i] && arr[i]!=max) {
                max2 = arr[i];
            }

        }


        System.out.println("2nd maximum valus is " + max2);
        return max2;


    }
    }

