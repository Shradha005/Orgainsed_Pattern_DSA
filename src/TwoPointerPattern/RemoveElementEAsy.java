package TwoPointerPattern;
import java.util.* ;

import static Practise_allpattern.Pp.PPPP;

public class RemoveElementEAsy {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = 2;
        int i = PPPP(a, k);
        System.out.println(i);
        for (int j = 0; j <= i; j++) {
            System.out.print(a[j] + " ");
        }
    }

    static int PPPP ( int[] a, int val)
        {
            int n = a.length;
            int left = 0;
            for (int right = 0; right < n; right++) {
                if (a[right] != val) {
                    a[left] = a[right];
                    left++;
                }

            }
            return left;

        }
    }

