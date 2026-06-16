package SlidingWindowPattern;

public class VariableMinLengthSubarray {
    static void main(String[] args )
    {
        int [] arr = {100,200,300,400};
        int target = 400;
        int ans   = Minsub(arr,target) ;
        System.out.print(ans) ;

    }
    static int Minsub(int [] arr,int target) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int n = arr.length;
        int res = Integer.MAX_VALUE;

        while (high < n) {

            sum = sum + arr[high];
            while (sum >= target) {
                int len = high - low + 1;
                res = Math.min(res, len);
                sum = sum - arr[low];
                low++;
            }
            high++;

        }
        return res;
    }

}
