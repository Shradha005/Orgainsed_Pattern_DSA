package array;

import java.util.ArrayList;
import java.util.List;



public class AverageOfEachWindow {

    static void main(String[] args) {
        int[] a = {100,200,300,400,500};
        int k = 2;
        float ans = maxReturn(a,k);
        System.out.print(ans);
    }
//    Time complexity of this algo is O (nk) because it prints window element every time
//    with its average so
//    otherwise it only takes O(n)

    static float maxReturn(int[] arr,int k) {
        int low = 0;
        int high = 1;
        int n = arr.length;
        int sum = 0;

        List<Integer> Li = new ArrayList<>() ;
        float average = 0;
        for (int i = 0; i <=high; i++) {
            sum = sum + arr[i];
            System.out.println(arr[i] + " ") ;
        }
            while (high < n) {
//            res = max(res, sum);
                average = (float) sum / k;
                System.out.println("here are the average of this window: " + average) ;
                low++;
                sum = sum - arr[low];
                high++;
                if (high == n)
                    break;
                sum = sum + arr[high];
                for(int i = low; i<=high ; i++)
                {
                    System.out.println(arr[i] + " ") ;
                }

            }
        return average;
    }
}

