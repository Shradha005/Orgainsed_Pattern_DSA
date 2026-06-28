package TwoPointerPattern;
import java.util.ArrayList ;
import java.util.Arrays;
import java.util.List;


//two sum with duplicate values here using List of List to store the result

public class TwoSumDuplicate {
    public static void main(String[] args)
    {
        int [] arr = {1,1,2,3,4,5,5} ;
        t2wo(arr);
    }
    public static void t2wo(int[] arr)
    {
        int n= arr.length ;
        int left = 0;
        int right = n-1 ;
        int sum = 0;
        int target = 9;

        List<List<Integer>> list = new ArrayList<>() ;
        while(left<right)
        {
            sum =  arr[left] + arr[right] ;
            if(sum == target) {
                list.add(Arrays.asList(arr[left], arr[right]));
                left++;
                right--;

                while (left < right && arr[left] == arr[left- 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }
            }
            else if(sum<target) {
                left++;
            }
            else {
                right -- ;
            }

        }
        System.out.println(list) ;

    }
}
