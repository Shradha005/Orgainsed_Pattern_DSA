package TwoPointerPattern;

import java.util.Arrays;
public class merge2Sortedarray {
    static void main(String[] args)
    {
        int[] arr = { 1,3,5} ;
        int[] brr = {2,4,6} ;
        int[]result=problem3sum(arr , brr);
        System.out.print(Arrays.toString(result)) ;
    }
    static int[] problem3sum(int[] arr , int[] brr)
    {
        int i= 0 ;
        int j= 0;
        int m = arr.length ;
        int n= brr.length ;
        int[] jrr = new int[m+n] ;
        int k = 0;
        while(i<m && j<n)
        {
            if(arr[i]<brr[j])
            {
                jrr[k] = arr[i] ;
                i++ ;
                k++;
            }
            else if (arr[i]>brr[j])
            {
                jrr[k]=brr[j] ;
                k++ ;
                j++ ;
            }
        }
        if(j<n)
        {
            jrr[k]=brr[j];
            k++;
            j++;
        }
        if(i<m)
        {
            jrr[k]=arr[i] ;
            k++ ;
            i++ ;
        }
        return jrr ;
    }
}

