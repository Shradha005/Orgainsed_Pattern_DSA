package SLowAndFast_Pattern;

public class MaxAbsSumKAdanes {

    public static void main(String[] args)
    {
        int [] a = {1,-3,2,3,-4} ;
        int ans = Abs(a) ;
        System.out.print(ans) ;

    }
    public static int Abs(int[] arr)
    {
        int n = arr.length ;
        int minending = 0;
        int maxending= 0 ;
        int maxsum = Integer.MIN_VALUE ;
        int minsum = Integer.MAX_VALUE ;


        for(int i = 0; i<n ; i++)
        {
            int v1 = arr[i] ;
            int v2 = maxending + arr[i];
            int v3 = minending + arr[i];
            maxending = Math.max(v1,v2) ;
            maxsum = Math.max(maxsum,maxending);
            minending = Math.min(v1,v3);
            minsum= Math.min(minsum,minending) ;
        }
        return Math.max(Math.abs(maxsum), Math.abs(minsum)) ;
    }
}
