package MergeInterval;
import java. util. * ;

public class InsertInterval {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,3},
                {6,9}
        };
        int[][] res = Merge(Insert(a)) ;
        for(int[]n: res)
        {
            System.out.print(Arrays.toString(n)) ;

        }

    }
    public static int [][] Merge(int [][] res)
    {
        int start1 = res[0][0] ;
        int end1   = res[0][1] ;
        ArrayList<int[]> ans = new ArrayList<>() ;
        int n = res.length ;
        for(int i =1 ; i<n ; i++)
        {
            int start2 = res[i][0] ;
            int end2 = res[i][1] ;
            if(end1>=start2)
            {

                end1 = Math.max(end1,end2);
                continue ;

            }
            ans.add(new int[] {start1 , end1});
            start1 = start2 ;
            end1 = end2;
        }
        ans.add(new int[] { start1 , end1 });
        return ans.toArray(new int[ans.size()][]) ;
    }
    public static int[][] Insert(int [][] a)
    {
        int[] interval = {2,5} ;
        int start1 = interval[0];
        int end1 = interval[1];
        boolean insert = false;
        ArrayList<int[]> newList = new ArrayList<>() ;

        int n = a.length ;
        for (int i = 0 ; i<n ; i++) {
            int start = a[i][0];

            if (!insert && start >= start1) {
                newList.add(new int[]{start1, end1});
                insert = true;
            }
            newList.add(new int[] {a[i][0],a[i][1]}) ;

        }


        return  newList.toArray (new int[newList.size()][]) ;
    }
}
