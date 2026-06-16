package SlidingWindowPattern;
import java.util.HashMap;
import java.util.Map;


public class fruitsIntoBasket {
    static void main(String[] args)
    {
        int [] arr = {1,2,0,2,1};
        int target = 2;
        int ans = FruitBasket(arr,target) ;
        System.out.print(ans);
    }

    static int FruitBasket(int[] a,int k)
    {
        int low = 0;
        int n = a.length ;
        int len = 0;
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int high = 0; high<n; high ++)
        {
            map.put(a[high],map.getOrDefault(a[high],0) + 1) ;
//            shrink window if more than 2 type
            while(map.size()>k)
            {
                    int left = a[low];
                map.put(left,map.get(left) - 1) ;
                    if(map.get(left)==0)
                        map.remove(left);
                    low++;

            }
            len = high - low + 1 ;
            res = Math.max(res,len);
        }
        return res;
    }


}
