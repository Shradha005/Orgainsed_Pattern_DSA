package Stack;
import java.util.* ;

public class RemoveAllADjacent {
    public static void main(String[] args)
    {
        String str = "abbbabaaa" ;
        System.out.print(Removeadjacent(str));

    }
    public static String Removeadjacent(String str )
    {
        int n = str.length();
        Stack<Character> ch  = new Stack<>() ;
        for(int i = 0; i<n; i++) {
            if (ch.empty()) {
                ch.push(str.charAt(i));
                continue;
            }
            if (ch.peek() == str.charAt(i)) {
                ch.pop();
                continue;
            }
            ch.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder() ;
        while(!ch.empty())
        {
                reversed.append(ch.peek()) ;
                ch.pop() ;
        }


        return reversed.reverse().toString();
    }
}
