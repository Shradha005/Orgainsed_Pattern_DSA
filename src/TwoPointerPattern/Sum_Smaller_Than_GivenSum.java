package array.q;

import java.util.ArrayList;
import java.util.List;

public class Sum_Smaller_Than_GivenSum {

    static void main(String[] args) {
        int[] a = {5, 1, 3, 4, 7};
        int sum = 12;
        int result = countTriplets(sum, a);
        System.out.print(result);
    }

    static int countTriplets(int sum, int []arr) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int count = 0;
        int Ssum = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            left = i + 1;
            right = n - 1;
            while (left < right) {
                Ssum = arr[i] + arr[left] + arr[right];
                if (Ssum >= sum) {
                    right--;
                }
                else  {

                    for(int k = right; k>left;k--)
                    {
                        count++;
                    }
                    left++;


                }

            }
        }

     return count ;
    }
}


