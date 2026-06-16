package array.q;

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {-30, -30, 0, 0, 10, 20, 30, 30};
        int size = removeDuplicates(arr) ;
        for(int i =0 ; i<size ; i++)
        {
            System.out.print(arr[i] + " ") ;
        }
    }

    static int removeDuplicates(int[] arr)
    {
//        here j is fixed for 0th place
        int j = 0;
        int n= arr.length ;
        int left = 0;
           for (int i = 1; i <arr.length; i++) {
               if (arr[j] != arr[i]) {
                   j++;
                   arr[j] = arr[i];
                   left++;
               } else
                   left++;
           }
//because at the final time j = 4 and here j=4 = 20 but we have 5 unique element so we return
//        j+1 ;
        return j+1 ;
    }
}