package SLowAndFast_Pattern;

public class Max_Kadanes_algo {
    public static void main(String[] args)
    {
        int [] a= {-2,-1,4,5,6} ;
        int res = kadanealgo(a) ;
        System.out.print(res) ;

    }
    public static int kadanealgo(int [] a)
    {
        int n= a.length ;
        int bestending = 0;
        int ans = Integer.MIN_VALUE ;
        for(int i= 0; i<n ; i++)
        {
            int v1 = bestending + a[i] ;
            int v2 = a[i];
            bestending = Math.max(v1,v2) ;
            ans = Math.max(ans , bestending) ;
        }
        return ans ;
    }
}
