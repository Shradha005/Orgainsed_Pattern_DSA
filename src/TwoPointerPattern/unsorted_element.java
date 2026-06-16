package array.q;

public class unsorted_element {
    public static void main( String[] args)
    {
        int[] arr = {2,3,4,5,2} ;
        System.out.print(unsorted(arr)) ;
    }
    static int unsorted(int[] arr)
    {
        boolean found = false ;
//        here correction in size that we give in the loop
            for( int i= 0 ; i<arr.length-1; i++)
            {
                if(arr[i]>arr[i+1]) {
                    System.out.println("unsorted element is " + arr[i]);
                    found = true;
                    break;
                }

            }
            if(found)
                System.out.println("unsorted element ") ;
            else
                System.out.println(" No unsorted element ") ;

        return -1 ;
    }
}
