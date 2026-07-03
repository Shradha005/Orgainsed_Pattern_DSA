package PrefixSumPattern;
import java . util .* ;

public class SumModuloByK {
    public static void main(String[] args )
    {

    }
    public static void SumModulo(int [] a , int k )
    {
        int sum = 0;
        int res = 0;
        int n = a.length ;
        Map<Integer, Integer> freq = new HashMap<>() ;
        freq.put(0,1) ;
        for (int i =0 ;i<n;i++)
        {
            sum += sum % k ;

        }
    }
}
