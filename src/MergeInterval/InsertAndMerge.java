package MergeInterval;
import java.util.* ;

public class InsertAndMerge {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {6, 9}
        };
        int[] newIntervals = {2, 5};
        int[][] res = insert(intervals,newIntervals) ;
        for (int[] n : res)
        {
            System.out.print(Arrays.toString(n) );

    }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length ;

        boolean insertFlag = false;
        ArrayList<int[]> inserted = new ArrayList<>() ;
        for(int i = 0 ; i<n;i++) {

            if(!insertFlag && intervals[i][0]>=newInterval[0])
            {
                inserted.add(new int[]{ newInterval[0],newInterval[1] }) ;
                insertFlag = true ;
            }
            inserted.add(intervals[i]) ;
        }
        if(!insertFlag)
        {
            inserted.add(new int [] { newInterval[0] , newInterval[1]}) ;
        }

        ArrayList<int[]> Merged  = new ArrayList<>() ;
        int start1 = inserted.get(0)[0] ;
        int end1 = inserted.get(0)[1] ;
        for(int i  = 1 ; i< inserted.size(); i++)
        {
            int start2 = inserted.get(i)[0];
            int end2 = inserted.get(i)[1] ;
            if(end1>=start2)
            {
                end1 = Math.max(end1,end2) ;
                continue ;
            }
            Merged.add(new int [] {start1,end1});
            start1 = start2  ;
            end1 = end2 ;


        }
        Merged.add(new int[] {start1,end1}) ;

        return Merged.toArray(new int[Merged.size()][]) ;
    }
}

