package PrefixSumPattern;
import java . util .* ;

public class SumModuloByK {
    public static void main(String[] args )
    {
        int[] arr = {4,5,0,-2,-3,1} ;
        int k = 5;
        int ans = SumModulo(arr,k) ;
        System.out.print(ans) ;
    }
    public static int SumModulo(int [] a , int k )
    {
        int sum = 0;
        int res = 0;
        int rem = 0;
        int n = a.length ;
        Map<Integer, Integer> freq = new HashMap<>() ;
        freq.put(0,1) ;
        for (int i =0 ;i<n;i++)
        {
            sum +=  a[i] ;
            rem = sum % k ;
            if(rem < 0)
            {
                rem = rem  + k ;
            }


            res += freq.getOrDefault(rem,0) ;
            freq.put(rem,freq.getOrDefault(rem,0) + 1) ;
        }
        return res ;
    }
}
