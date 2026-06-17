package SlidingWindowPattern;

public class Longest_Replacement_Character {
    static void main(String[] args)
    {
      String ch ="BABBABB";
      int k = 2;
      int ans  = replace(ch,k) ;
      System.out.println(ans) ;
    }
    static int MAXIMUM(int[] hash)
    {
        int mxcnt = -1;
        for(int i= 0; i<256;i++)
        {
            mxcnt = Math.max(mxcnt,hash[i]) ;

        }
        return mxcnt ;
    }
    static int replace(String s , int k )
    {
        int [] hash = new int[256];
        int low = 0;
        int high ;
        int len = 0;
        int mxcnt = 0;
        int diff = 0;
        int res = 0;

        for( high = 0; high<s.length() ;high++) {
            hash[s.charAt(high)]++;
            len = high - low + 1;
            mxcnt = MAXIMUM(hash);
            diff = len - mxcnt;

            while (diff > k) {
                hash[s.charAt(low)]--;
                low++;
                mxcnt = MAXIMUM(hash);
                len = high - low + 1;
                diff = len - mxcnt;
            }
            len = high-low+1;
            res = Math.max(res,len) ;
        }


        return res ;
    }

}
