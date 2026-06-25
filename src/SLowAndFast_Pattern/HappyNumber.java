package SLowAndFast_Pattern;

public class HappyNumber {
    public static void main(String[] args )
    {
        int n=19;
        System.out.println(Happy(n)) ;
    }
    public static boolean Happy(int n)
    {
        int slow = n;
        int fast = n;
        while(true)
        {
            if (fast == 1) break;
            slow = increase(slow) ;
            fast = increase(fast) ;
            fast = increase(fast) ;
            if(slow == fast && slow != 1)
            {
                return false ;
            }
        }
        return true ;
    }
    public static int increase ( int n)
    {
        int d= 0;
        int sum = 0;
        while(n>0)
        {
            d = n % 10;
            sum= sum + d*d;
            n= n / 10;
        }
        return sum ;
    }
}
