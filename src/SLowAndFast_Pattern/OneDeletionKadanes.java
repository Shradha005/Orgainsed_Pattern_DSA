package SLowAndFast_Pattern;

public class OneDeletionKadanes {
    public static void main(String[] args)
    {
//        int[] a = {1,-2,0,3} ;
        int[] a = {-1,-1,-1,-1} ;
        int ans = OneDelete(a) ;
        System.out.print(ans) ;
    }

    public static  int OneDelete(int []arr)
    {
        int n= arr.length ;
        int power = 0;
        int nopower = arr[0];
        int res  = arr[0];

        for(int i =1; i<n ; i++)
        {
            int v1 = arr[i] ;
            int v2  = nopower + arr[i] ;
            int v3 = power + arr[i];
            int v4 = nopower ;
            nopower = Math.max(v1,v2) ;
            power = Math.max ( v3,v4) ;
            res = Math.max(res , Math.max(nopower,power)) ;


        }
        return res ;
    }
}
