package TwoPointerPattern;
import java.util.* ;

public class TwoSUM_other_approach {
    public static void main(String[] args)
    {
            int [] arr = {2,7,11,15} ;
            int target = 9 ;
            int[] ans = Two_sum(arr,target) ;
            System.out.print(Arrays.toString(ans)) ;
    }
    static int[] Two_sum(int[] a,int target) {

        Map<Integer,Integer>HashMap = new HashMap<> () ;
        int n= a.length ;
        for(int i = 0; i< n;i++)
        {
            int complement = target - a[i] ;
            if(HashMap.containsKey(complement))
            {
                return new  int[] { HashMap.get(complement),i} ;
            }
            HashMap.put(a[i],i);
        }
    return new int[]{} ;
    }

}
