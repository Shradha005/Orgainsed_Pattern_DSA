package array.q;

public class zeroes_end {
    public static void main(String[] args )
    {
        int[]nums = {0, 1, 4, 0, 5, 2} ;
//         zeroesEnd(nums);
         endzero(nums) ;
    }
//    Two pointer approach
    static void  zeroesEnd(int[] nums)
    {
        int j=0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                nums[j] = nums[i] ;
                j++ ;
            }
        }
        while(j<nums.length)
        {
            nums[j]=0;
            j++ ;
        }
        for(int i = 0 ; i<nums.length; i++)
        {
            System.out.print(nums[i]) ;
        }

    }

//     swapping optimized way
 static void endzero(int[] nums)
 { int j = 0;
     for(int i =0 ; i< nums.length; i++)
     {

         if(nums[i]!=0)
         {
             int temp = nums[i] ;
             nums[i]= nums[j] ;
             nums[j] =temp ;
             j++ ;
          }
     }
     for (int num : nums) {
         System.out.print(num);
     }
}
}
