package SlidingWindowPattern;

import java.util.HashMap;

public class LongestSubStringKDIstinct {
    static void main(String[] args)
    {
        String s = "ababsbsbcbebeb" ;
        int target = 3;
        int ans = SubString(s,target) ;
        System.out.println("here is the length of the longest substring : " + ans) ;

    }
//    Time Complexity of this Algorithm is : O(n) ;
    static int SubString(String s ,int k)
    {
        int low = 0;
        int n = s.length() ;
        int len = 0;
        int res = 0;
        int newlow=0;
        HashMap<Character,Integer> map = new HashMap<>() ;
        for(int high = 0; high < n; high ++)
        {
            char ch = s.charAt(high) ;
            map.put(ch, map.getOrDefault(ch, 0) + 1) ;
            while(map.size()>k)
            {
                char left = s.charAt(low) ;
                map.put(left , map.get(left) -1 ) ;
                if(map.get(left)==0)
                    map.remove(left) ;
                low++;
            }
            if(map.size()==k) {
                len = high - low + 1;
                if(len>res)
                {    res= len;
                    newlow=low;
                }
            }
        }
        String longestSubstring = s.substring(newlow, newlow + res ) ;
        System.out.println(longestSubstring) ;
    return res;

    }
}
