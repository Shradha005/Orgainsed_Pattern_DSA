package SlidingWindowPattern;

public class MinWindowSubsString {
    static void main(String[] args)
    {
        String s = "ADOBECODEBANC" ;
        String t = "ABC" ;
        String result = Window(s,t) ;
        System.out.println(result) ;

    }
    static boolean right(int[] hash , int [] freq)
    {
        for (int i = 0; i < 256; i++) {
            if (hash[i] < freq[i])
                return false;

        }
        return true;
    }

    static String Window(String s , String t)
    {
        int[] hash = new int[256] ;
        int[] freq = new int[256] ;

        int low = 0 ;
        int n = s.length();
        int m = t.length() ;
        int res = Integer.MAX_VALUE ;
        int start = 0;
        for(int high = 0 ; high<m; high++)
        {
            freq[t.charAt(high)] ++ ;
        }
        for(int high = 0; high<n;high++)
        {
            hash[s.charAt(high)]++;
            while(right(hash,freq))
            {
                int len = high - low +1 ;
                if(res>len) {
                    res = len;
                    start = low;
                }
                hash[s.charAt(low)]--;
                low++;
            }
        }
        if(res== Integer.MAX_VALUE)
            return "";


        return s.substring(start , start+res) ;
    }
}