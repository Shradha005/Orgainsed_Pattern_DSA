package TwoPointerPattern;

import java.util.*;

public class Sum3Closest
{
    static void main(String[] args)
    {
        int[] arr = {-1,2,1,-4} ;
        int target = 1;
        int ans = diff(arr,target) ;
        System.out.print(ans);

    }
    static int diff(int[] a,int target) {
        int n = a.length;
        Arrays.sort(a) ;
        int left = 0;
        int right = n - 1;
        int sum ;
        int ans = 0;
        int diff ;
        int max_diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            left = i+1;
            right = n-1;
            while (left < right) {
                sum = a[i] + a[left] + a[right];
                diff = Math.abs(sum - target);
                if (diff < max_diff) {
                    max_diff = diff;
                    ans = sum;
                }
                if (sum < target)
                    left++;
                else if(sum>target)
                    right--;
                else
                    return sum ;

            }
        }

        return ans ;
    }

//    static List<List<Integer>> ThreeSum(int[] a)
//    {
//        int n= a.length;
//        int left =0;
//        int right = n-1;
//        Arrays.sort(a);
//        int sum= 0;
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i =0; i<n-2;i++)
//        {
//            if (i>0 && a[i] ==a[i-1])
//            {
//                continue;
//            }
//            while(left<right) {
//                left++;
//
//                sum = a[i] + a[left] + a[right];
//                if(sum==0) {
//                    result.add(Arrays.asList(a[i], a[left], a[right]));
//                    left++;
//                    right--;
//
//                    while (left < right && a[left] == a[left + 1])
//                        left++;
//                    while (right > 0 && a[right] == a[right - 1])
//                        right--;
//                }
//                else if(sum<0)
//                    left++;
//                else
//                    right--;
//            }
//        }
//     if(result.isEmpty())
//         System.out.print("not found") ;
//
//        return result ;
//
//    }
}