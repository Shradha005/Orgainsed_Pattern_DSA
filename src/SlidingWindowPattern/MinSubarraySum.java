package SlidingWindowPattern;

public class MinSubarraySum {
    static void main(String[] args)
    {

    int [] a = {2,3,1,2,4,3} ;
    int target = 7;
    int result = Min(a,target) ;
    System.out.print(result) ;
    }
    static int Min(int[] arr,int k )

    {
        int low= 0;
        int sum =0;
        int ans = Integer.MAX_VALUE ;
        int n = arr.length ;
        for(int high= 0; high<n;high++)
        {
            sum = sum + arr[high];
            while (sum>=k)
            {
                int len = high-low + 1;
                ans = Math.min(ans, len);
                sum = sum - arr[low];
                low++;
            }
        }
        return ans;
    }
}

