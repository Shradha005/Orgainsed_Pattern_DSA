package SLowAndFast_Pattern;

public class MIN_KADANES {
    public static void main(String[] args)
    {
        int[] arr = {3,-4, 2,-3,-1, 7,-5}  ;
        int res = smallestSumSubarray(arr) ;
        System.out.print (res) ;

    }
    static int smallestSumSubarray(int[] a)
    {

        int ans = Integer.MAX_VALUE;
        int bestending = 0;
        int n = a.length;
        for(int i = 0 ; i< n ;i++)
        {
            int v1 = a[i] ;
            int v2 = bestending + a[i] ;
            bestending = Math.min(v1,v2) ;
            ans = Math.min(ans,bestending) ;
        }
        return ans ;
    }
}

