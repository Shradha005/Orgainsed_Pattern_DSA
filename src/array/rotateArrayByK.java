package array;

import java.util.Arrays;
import java.util.Scanner ;

public class rotateArrayByK {
    public static void main(String[] args )
    {
        int[] arr = {1, 2, 3, 4, 5, 6} ;
        System.out.println("enter the steps you want to move the array :") ;
        Scanner sc = new Scanner(System.in) ;
        int k = sc.nextInt() ;
        rotateByk(arr,k);

    }
    public static void rotateByk(int [] arr,int x )
    {

        for(int i = 0 ; i<x;i++)
        {
            int first = arr[0] ;
            int k =0;
           for(int j = 0 ; j<arr.length-1 ; j++)
           {
               arr[k] = arr[j+1] ;
               k++ ;

           }
        arr[arr.length-1] = first ;
        }
        System.out.print(Arrays.toString(arr)) ;
    }
}
