package array;

import java.util.Arrays;
public class rotateByLeft{
    public static void main(String[] args )
{
    int[] arr = {11,224,35,46,57} ;
    rotateArrayByOne(arr) ;

}
static void rotateArrayByOne(int[] arr) {

    int j = 0;
    int first = arr[0] ;
    for(int i = 0; i<arr.length-1 ; i++)
    {
        arr[j]=arr[i+1] ;
        j++;

    }
    arr[arr.length-1] = first ;
    System.out.print(Arrays.toString(arr)) ;
}
}


