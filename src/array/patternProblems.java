package array;

public class patternProblems {
    static void main(String[] args) {
        pattern(3);
    }
    static void pattern(int n)
    {
        for(int i = 0 ; i< 2 * n ; i++)
        {
            int c = i> n ? 2*n - i: i ;
            for(int j = 0 ; j<c ; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println() ;
        }
    }

}
