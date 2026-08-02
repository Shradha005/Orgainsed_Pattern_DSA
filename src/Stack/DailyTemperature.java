package Stack;
import java.util.*;

public class DailyTemperature {
    public static void main(String[] args)
    {
        int[] res = {30,40,50,60};
        int[] s = dailytemp(res);
        System.out.print(Arrays.toString(s)) ;
    }
    public static int[] dailytemp(int[] a)
    {
        int n = a.length;
        Stack<Integer> st = new Stack<>() ;
        int[] ans = new int[n];
        for(int i =n-1 ; i>=0 ;i--)
        {
//            why we check value of the peek element  here (a[st.peek())
            while(!st.empty() && a[st.peek()] <=a[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                ans[i] = 0;
            }
            else
            {
                ans[i] = st.peek()-i;

            }
//            because in stack we push indices where in other we store direct values
            st.push(i);
        }
        return ans ;
    }
}
