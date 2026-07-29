package Stack;
import java.util.*;

public class Valid_parenthesis {
    public static void main(String[] args)
    {

        String s = "{(])";
        System.out.print(CheckBrackets(s));

    }
    public static  boolean CheckBrackets(String s)
    {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n ; i++)
        {
            char ch = s.charAt(i);
//            opening hai to daaldo
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch) ;

            }
             else {
//                agar closing aagya to kyun dalengye phele tb return kr dengye false
                if(st.empty())
                {
                    return false;
                }
//
                if(st.peek() != '(' && ch==')')
                {
                    return false;
                }
                if(st.peek() != '[' && ch==']')
                {
                    return false;

                }
                if(st.peek() != '{' && ch=='}')
                {
                    return false;
                }
             st.pop();
            }
        }
        return st.empty();
    }
}
