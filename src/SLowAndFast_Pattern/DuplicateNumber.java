package SLowAndFast_Pattern;

public class DuplicateNumber {
    public static void main(String[] args )
    {
       int[] arr = {1,3,4,5,6,3,2} ;
       int ans = Duplicate(arr) ;
       System.out.print(ans) ;

    }
    public static int Duplicate(int [] a)
    {
        int slow = 0;
        int fast = 0;
        while(true)
        {
            slow=a[slow] ;
            fast = a[fast];
            fast = a[fast] ;
            if(slow == fast )
            {
                slow=0 ;
                while(slow!=fast)
                {
                    slow= a[slow] ;
                    fast = a[fast] ;

                }
                return slow ;
            }

        }
    }
}