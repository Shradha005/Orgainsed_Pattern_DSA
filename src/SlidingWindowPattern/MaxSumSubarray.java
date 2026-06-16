package SlidingWindowPattern;

public class MaxSumSubarray {
    static void main(String[] args)
    {
        int [] a = {100,200,300,400} ;
        int ans = MaxSum(a);
        System.out.println(ans) ;
    }
    static int MaxSum(int[] arr)
    {
        int n = arr.length ;
        int low = 0;
        int high = 1;
        int sum = 0;
        int res = 0;
        for(int i = 0; i<=high;i++)
        {
            sum= sum +arr[i] ;
        }
        while(high<n)
        {
            res = Math.max(res,sum) ;
            low++;
            high++;
            sum= sum-arr[low-1] ;
            if(high==n)
                break;
            sum = sum + arr[high] ;


        }
        return res;
    }
}
