package Stack;

import java.util.Stack;

public class reverseStringByStack {
    public static void main(String[] args) {
        String str = "Shradha";
        Stringreverse(str);


    }

    public static void Stringreverse(String str) {
        Stack<Character> ch = new Stack<>();

        int n = str.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            ch.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();

        while (!ch.empty()) {

            reversed.append(ch.pop());
        }

        System.out.print(reversed.toString());

    }
}
