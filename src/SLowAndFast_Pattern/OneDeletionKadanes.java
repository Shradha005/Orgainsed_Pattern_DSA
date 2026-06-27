package SLowAndFast_Pattern;

public class OneDeletionKadanes {
    public static void main(String[] args)
    {
        int[] a = {1,-2,0,3} ;
        int ans = OneDelete(a) ;
        System.out.print(ans) ;
    }

    public static  int OneDelete(int []arr)
    {
        int n= arr.length ;
        int power = 0;
        int nopower = 0;
        int res  =0;

        for(int i =0; i<n ; i++)
        {
            int v1 = arr[i] ;
            int v2  = nopower + arr[i] ;
            int v3 = power;
            int v4 = power + arr[i] ;
            nopower = Math.max(v1,v2) ;
            power = Math.max ( v3,v4) ;
            res = Math.max(power,nopower) ;

        }
        return res ;
    }
}
