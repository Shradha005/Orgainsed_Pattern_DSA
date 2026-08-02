package TwoPointerPattern;
import java . util.*;

public class CountTriplets {
    public static void main(String[] args) {

        int[] arr = {-2,0,1,3} ;
        int sum = 2;

        List<List<Integer>> ans = CountInteger(arr,sum) ;

        System.out.print(ans) ;

    }


    public static List<List<Integer>> CountInteger(int[] a, int sum) {
        int left = 0;
        int n = a.length;
        int right = n - 1;
        int Ssum = 0;
        int count = 0;
        List<List<Integer>> res = new ArrayList<>() ;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            left = i + 1;
            right = n - 1;
            while (left < right) {
                Ssum = a[i] + a[left] + a[right];
                if (Ssum < sum) {

                    for(int j = right ;j>left;j--) {
                        res.add(Arrays.asList(a[i], a[left], a[j]));

                    }
                    count += (right - left);
                    left++;



                } else {
                    right--;
                }

            }
        }
        System.out.println("No. of subarrays which has small sum : " + count);


        return res ;
    }
}
