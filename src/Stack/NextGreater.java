package Stack;
import java.util.*;

public class NextGreater {
    public static void  main(String[] args)
    {
        int[] arr = {4,5,2,25};
        int[] ans = nextgreater(arr);
        System.out.print(Arrays.toString(ans));

    }
    public static int[] nextgreater(int[] a)
    {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
//        st.push(a[n-1]);
        for(int i =n-1; i>=0;i--)
        {
            while(!st.empty() && st.peek() <= a[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                res[i] = -1;
            }

            else {
                res[i] = st.peek();
            }

            st.push(a[i]);
        }
        return res ;
    }
}
