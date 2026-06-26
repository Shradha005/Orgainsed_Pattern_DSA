package SLowAndFast_Pattern;

public class Product_KADANE {
    public static void main(String[] args)
    {
        int[] arr = {2,3,-2,4} ;
        int res = maximumProduct(arr) ;
        System.out.print(res) ;

    }
    public static int maximumProduct(int[] a)
    {
        int n = a.length ;
        int min_ending = 0 ;
        int max_ending = 0;
        int ans = Integer.MIN_VALUE ;
        for(int i = 0; i<n ; i++)
        {
            int v1 = a[i] ;
            int v2 = min_ending * a[i] ;
            int v3 = max_ending * a[i] ;
            max_ending = Math.max(v1,Math.max(v2,v3)) ;
            min_ending = Math.min(v1,Math.min(v2,v3)) ;
            ans = Math.max(ans,Math.max(max_ending,min_ending)) ;

        }
        return ans ;
    }
}
