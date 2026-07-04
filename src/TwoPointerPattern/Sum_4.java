package TwoPointerPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_4 {
    public static void main(String[] args)
    {
        int[] a = {1,0,-1,0,-2,2} ;
        int target = 0;
        List<List<Integer>> ans = Sum(a,target) ;
        System.out.print(ans) ;

    }
    public static List<List<Integer>>  Sum(int[] a, int target)
    {
        int n= a.length ;
        int left = 0;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(a) ;
        for(int i = 0; i<n-3; i++)
        {
            if(i>0 && a[i] == a[i-1])
            {
                continue ;
            }
            for(int j = i+1 ; j < n-2 ; j++)
            {
                if(j > i+1 && a[j] == a[j-1])
                    continue;
                left = j +1 ;
                int right = n-1 ;
                while(left < right ) {
                    long sum = (long)a[i] + a[j] + a[left] + a[right];
                    if (sum == target) {
                        result.add(Arrays.asList(a[i], a[j], a[left], a[right]));
                        while(left < right && a[left] == a[left + 1])
                            left++;
                        while(left < right && a[right] == a[right -1 ])
                            right--;
                        left++;
                        right-- ;
                    }
                    else if (sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        return result ;
    }
}
