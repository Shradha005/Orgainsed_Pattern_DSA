package TwoPointerPattern;
import java .util.* ;
public class TripletSum {
    public static void main(String[] args )
    {
        int[] arr ={-2,0,1,1,2} ;
       List<List<Integer>> ans = triplesum(arr);
       System.out.println(ans) ;

    }
    public static List<List<Integer>> triplesum(int[] a)
    {   int n = a.length ;
//        Arrays.sort(a);
        int left = 0;
        List<List<Integer>> result = new ArrayList<>() ;
        int right = n-1 ;
        for(int i = 0 ; i<n-2; i++)
        {
            if(i>0 && a[i] == a[i-1])
                continue;
            left=i+1;
            right=n-1;
            while(left<right) {
                int sum = a[i] + a[left] + a[right];
                if (sum == 0) {
                    result.add(Arrays.asList
                            (a[i], a[left], a[right]));
                    left++;
                    right--;
                    while (left < n&& a[left] == a[left + 1]) {
                        left++;
                    }
                    while (right > 0 && a[right] == a[right - 1]) {
                        right--;
                    }
                }
                else if(sum<0)
                    left++;
                else

                    right--;
            }

        }
        return result ;
    }
}
