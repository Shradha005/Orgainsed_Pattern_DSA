package Stack;
import java.util.*;

public class PreviousGreater {
    public static void main(String[] args)
    {
        int[] arr = {4,5,2,25};
        int[] res = reversestack(arr);
        System.out.print(Arrays.toString(res));

    }
    public static int[] reversestack(int[]a)
    {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0 ; i<n ;i++)
        {
            while(!st.empty() && st.peek() <= a[i])
                st.pop();
            if(st.empty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(a[i]);
        }
        return ans;
    }
}
