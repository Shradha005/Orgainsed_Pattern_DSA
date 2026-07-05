package PrefixSumPattern;
import java.util.*;

public class ContigousArray {
    public static void main(String[] args)
    {
        int[] arr = {0,1,1,1,1,1,0,0,0} ;
        int ans = Contiggous(arr) ;
        System.out.print(ans) ;


    }
    public static int Contiggous (int[] a)
    {
        int zero =0;
        int one= 0;
        int diff = 0;
        int n = a.length;
        int res = 0;
        Map<Integer,Integer> freq = new HashMap<>() ;
        for(int i = 0; i< n; i++) {
            if (a[i] == 0) {
                zero++;
            } else {
                one++;
            }
            diff = zero - one ;
            if(diff == 0)
            {
                res = Math.max(res, i+1) ;
            }
            if(!freq.containsKey(diff))
            {
                freq.put(diff,i) ;
            }
            else {
                int idx = freq.getOrDefault(diff,0) ;
                int len = i - idx ;
                res = Math.max(len,res) ;


            }
        }
        return res ;

    }
}
