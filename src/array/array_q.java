package array;

import java.util.Arrays;

public class array_q {
    public static void main(String[] args)
    {

     int[]arr = { 0 ,1 , 1 ,0 ,1};
     int[] result = count(arr) ;
     System.out.println(result[0]) ;
     System.out.println( result[1]) ;


    }
    static int[] count(int[]arr )
    {
        int countzero = 0;
        int countone = 0 ;
         for (int i = 0 ; i <arr.length ; i++)
        {
            if(arr[i]==0)
            {
                countzero ++ ;
            }
            else
            {
                countone++ ;
              ;
            }
        }
         int [] ans = { countzero ,countone} ;
        return ans ;
    }
}
