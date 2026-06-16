package SlidingWindowPattern;
import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithoutDuplicate {
    static void main(String[] args)
    {
        String s = "abcabcbb" ;
        Duplicate(s);
    }
    static void  Duplicate(String a)
    {
        int low = 0;
        int n = a.length() ;
        int newlow = 0;
        int res = 0;
        Map<Character,Integer> fre = new HashMap<>();
        for(int  high = 0; high<n ; high ++)
        {
            char ch = a.charAt(high) ;
            fre.put(ch,fre.getOrDefault(ch,0) + 1) ;
            int  k = high-low +1 ;
            while(fre.size() < k)
            {
                char l = a.charAt(low);
                fre.put(l,fre.get(l)-1) ;
                    if(fre.get(l)==0)
                        fre.remove(l);
                low++;
                k = high - low + 1;
            }
            int len= high - low + 1;
            if(len>res) {
                res = len;
                newlow = low;
            }

        }
        String longestSub = a.substring(newlow , newlow + res ) ;
        System.out.println("Characters of the Substring is:" + longestSub ) ;
        System.out.println("Length of the Substring is :" + res) ;
    }
}
