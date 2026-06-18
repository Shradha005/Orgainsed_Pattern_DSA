package array;

public class negandpos {
    public static void main(String[] args)
    {
        int[] arr = { 2,3 ,4,-1,-1} ;
        int[] result = sum(arr) ;
        System.out.println("positive numbers " + result[0]) ;
        System.out.println("negative numbers" + result[1]) ;

    }
    static int[] sum(int[] arr)
    {
        int possum=0;
        int negsum=0;
        for(int i =0 ; i<=arr.length-1 ; i++)
        {
            if(arr[i]>0)
                possum+=arr[i] ;
            else
                negsum+=arr[i];
        }
        int[] ans = {possum, negsum} ;
        return ans ;
    }

}
