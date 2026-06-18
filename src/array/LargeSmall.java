package array;

public class LargeSmall {
    public static void main(String[] args)
    {
        int[] arr = {8,8,8,8,8};
        int[] result = largestElement(arr) ;
        System.out.println(" Largest elemnet in the array is :"+ result[0]);
        System.out.println(" Smallest elemnet in the array is :"+ result[1]);

    }
public static int[] largestElement(int[] arr) {
    int Large = Integer.MIN_VALUE;
    int Slarge = Integer.MIN_VALUE ;

    for (int i = 0; i <=arr.length - 1; i++) {
        if (arr[i]>Large) {
            Slarge = Large;
            Large=arr[i] ;
        }
        else if(arr[i] > Slarge && arr[i]!=Large)
        {
            Slarge=arr[i] ;
        }


    }
    if(Slarge==Integer.MIN_VALUE)
    {
        Slarge=-1;
    }

    return new int[] {Large,Slarge};
}



}




