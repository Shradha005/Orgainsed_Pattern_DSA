package TwoPointerPattern;

import java.util.Arrays;

public class swap_array {
    public static void main(String[] args )
    {
        int[] arr = { 2,3,4,7,6,8,9,} ;
        int[] result = swap(arr) ;
        System.out.println(Arrays.toString(result)) ;

    }
    static int[] swap(int[] arr)
    {  int size = arr.length ;
        int[] newarr=new int[size];
        int start = 0;
        int end  = arr.length-1;
        int i= 0;
        while(start<end)
        {
            newarr[i++]=arr[end--] ;
            if(start<=end)
            {
                newarr[i++]=arr[start++] ;
            }
        }
        return newarr ;

    }
}
