package MergeInterval;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public static void main(String[] args) {
      int[][]array  = {
              {1,3},
              {2,6},
              {8,10},
              {15,18},

      };
//
//      for(int i = 0; i< n ;i++)
//      {
//          System.out.println(array[i][0] + " " + array[i][1]) ;
//          }

      int[][] res = merge(array);
        int n = res.length ;
        for(int i = 0; i< n ;i++)
        {
            System.out.println(res[i][0] + " " + res[i][1]) ;
        }

    }

    public static int[][] merge(int[][] a) {
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
        int n = a.length;
        ArrayList<int[]> ans = new ArrayList<>();
        int start1 = a[0][0];
        int end1 = a[0][1];
        for (int i = 1; i < n; i++) {
            int start2 = a[i][0];
            int end2 = a[i][1];
            if (end1 >= start2) {
                start1 = start1;
                end1 = Math.max(end1, end2);
                continue;
            }
            ans.add(new int[]{start1, end1});
            start1 = start2;
            end1 = end2;

        }
        ans.add(new int[]{start1, end1});
        return ans.toArray(new int[ans.size()][]);
    }
}