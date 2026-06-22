package TwoPointerPattern;
import java.util.Arrays;

// Problem is  : given a sorted array we need to square and sort again

class Square_array {
    public void main(String[] args)
    {
        int[] arr = {-4,-1,0,3,10 };
        int[] result = sortedSquares(arr) ;
        System.out.print(Arrays.toString(result)) ;
    }

//    This is the optimal approach by using 2 pointer and here it is used new array for storing .
//    time : o(n) and space O(n)
//    therefore this is my final ans..

    public int[] sortedSquares(int[] nums)
    {
        int n = nums.length  ;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n] ;
        int k = n-1 ;
        while(left <=right)
        {
              int leftSquare = nums[left] * nums[left] ;
              int rightsquare  = nums[right]  * nums[right] ;

            if( leftSquare>rightsquare)
            {
               ans[k] = leftSquare ;
               left++ ;


            }
            else {
                ans[k] = rightsquare;
                right--;
            }

            k-- ;
        }

        return ans  ;
    }
}



//Here i am trying to solve same problem without making new array , using swapping logic
//but after that i released that is not a good approach
//class Solution {
//    public static void main(String[] args) {
//        int[] nums = {-11, -2, 1, 9};
//        sortedSquares(nums);
//        System.out.print(Arrays.toString(nums));
//
//    }
//
//    static void sortedSquares(int[] arr) {
//        int n = arr.length;
//        int left = 0;
//        int right = n - 1;
//        for (int i = 0; i <= arr.length - 1; i++) {
//            arr[i] = arr[i]*arr[i] ;
//        }
//        while (left <right) {
//            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            } else
//                left++;
//        }
//
//
//    }
//}
