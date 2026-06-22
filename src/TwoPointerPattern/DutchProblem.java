package TwoPointerPattern;
import java.util.Arrays;

public class DutchProblem {

    static void main(String[] args) {
        int[] a = {0, 2, 1, 1, 0, 0, 1};
        dutch(a);
        System.out.print(Arrays.toString(a));

    }

    // best approach
    static void dutch(int[] arr) {
        int low= 0;
        int high= arr.length-1;
        int mid = 0;

        while(mid <= high)
        {
            if(arr[mid]==0)
            {
               int  temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else  {
                int temp = arr[mid];
                arr[mid]=arr[high] ;
                arr[high]=temp;
                high--;
            }
        }

    }


}

