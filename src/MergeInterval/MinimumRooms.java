package MergeInterval;

import java.util.Arrays;

public class MinimumRooms {
    public static void main(String[] args)
    {
        int[] start ={2,6,9} ;
        int[] end = {4,10,12} ;
        int res = minMeetingRooms(start,end) ;
        System.out.print(res) ;

    }

    public static int minMeetingRooms(int[] start, int[] end)
    {
        // code here
        int n = start.length ;
        Arrays.sort(start) ;
        Arrays.sort(end) ;
        int i = 0;
        int j = 0 ;
        int count = 0;

        int res = 0 ;
        while(i<n && j<n)
        {
            if(start[i]<end[j])
            {
                count++;
                res = Math.max(res,count) ;
                i++;

            }
            else {
                count--;
                j++;
            }

        }
        return res ;
    }
}
