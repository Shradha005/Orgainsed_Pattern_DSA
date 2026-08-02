package Stack;
import java.util.*;

public class CircularArrayNextGreater {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int[] res = circularNext(arr);
        System.out.print(Arrays.toString(res));


    }
    public static int[] circularNext(int[]a)
    {
        int n = a.length;
        Stack<Integer> st  = new Stack<>();
        int[] ans  = new int[n];
        for(int i = n-2; i>=0;i--)

        {
            st.push(a[i]);
        }
        for(int i = n-1;i>=0;i--)
        {
            while(!st.empty() && st.peek() <= a[i])
            {
                st.pop();

            }
            if(st.empty())
                ans[i] = -1;
            else
                ans[i] = st.peek();
            st.push(a[i]);
        }
        return ans ;
    }


}
