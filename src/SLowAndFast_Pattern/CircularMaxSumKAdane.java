package SLowAndFast_Pattern;

public class CircularMaxSumKAdane {
    public static void main( String[] args)
    {
        int [] arr = {-3,-2,-3};
        int ans = Circular(arr);
        System.out.print(ans) ;

    }
    public static int Circular(int[]a )
    {
        int n = a.length ;
        int maxending = a[0];
        int minending = a[0];
        int maxsum = a[0];
        int minsum = a[0];
        int sum = a[0];

        for(int i = 1 ; i< n ; i++)
        {
             int v1 = a[i] ;
             int v2 = maxending + a[i];
             int v3 = minending + a[i] ;
             maxending = Math.max(v1,v2) ;
             minending = Math.min(v1,v3) ;
             maxsum = Math.max(maxsum, maxending );
             minsum = Math.min(minsum,minending) ;
             sum+=a[i];
        }
        if(maxsum <0 )
            return maxsum ;
        return Math.max(maxsum,sum-minsum) ;

    }
}
