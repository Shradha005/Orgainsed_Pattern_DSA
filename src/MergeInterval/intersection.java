package MergeInterval;
import java.util.* ;

public class intersection {
    public static void main(String[] args) {
        int[][] a =
                {
                        { 0,2,},
                        {5,10},
                                {13,23},{24,25}
                } ;
        int [][]  b ={
                {1,5},
                {8,12},
               {15,24},
               {25,26}
        };
        int[][] res = intervalIntersection(a,b) ;
        int n =res.length ;
        for (int[] re : res) {
            System.out.print(Arrays.toString(re));
        }

    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int n = firstList.length;
        int m = secondList.length;
        int i  =0 ;
        int j =0;
        ArrayList<int[]> newList = new ArrayList<>();
        while (i < n && j < m) {
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            if (start1 <= start2) {
                if (end1 >= start2) {
                    int s = Math.max(start1, start2);
                    int e = Math.min(end1, end2);
                    newList.add(new int[]{s, e});

                }
            } else {
                if (end2 >= start1) {
                    int s = Math.max(start1, start2);
                    int e = Math.min(end1, end2);
                    newList.add(new int[]{s, e});
                }
            }
            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }
        return newList.toArray(new int[newList.size()][]);
    }
}