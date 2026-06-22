package TwoPointerPattern;

import java.util.Arrays;

public class twoSum {

    public static void main(String[] args)
    {
        int[] arr = {2,7,11,15 };
        int target = 26 ;
        int [] result = two(arr,target) ;
        System.out.print(Arrays.toString(result));
    }
    public static int[] two(int[] num, int target) {

        int j = num.length - 1;
        int i = 0;
        int idx1 = 0 ;
        int idx2 = 0 ;

        while (i < j) {
            int sum = num[i] + num[j];
            if (sum == target) {
               idx1+=i ;
               idx2+=j ;
               break;
            } else if (sum < target) {
                i++;
            } else
                j--;
        }
        int[] ans = {idx1,idx2} ;
        return ans;


    }

}
