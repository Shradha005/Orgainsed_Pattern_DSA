package PrefixSumPattern;
import java.util.* ;

public class SumEqualsToK {
    public static void main(String[] args)
    {

        int [] arr = {1,1,1} ;
        int k = 2;
        int ans = SumK(arr,k) ;
        System.out.print(ans) ;

    }
    public static int SumK(int[]a,int k )
    {
        int sum = 0;
        int n = a.length ;
        int res = 0;
        Map<Integer,Integer> freq = new HashMap<>() ;
        freq.put(0,1) ;
        for(int i = 0 ; i<n;i++)
        {
//            prefix sum count here

            sum+=a[i] ;

//            this hashmap function help to return the frequency of the value if
//            it's present in hash

            res += freq.getOrDefault(sum - k, 0);

            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return res  ;
    }
}
