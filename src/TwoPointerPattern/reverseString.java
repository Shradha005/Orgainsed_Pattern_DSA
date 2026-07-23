package TwoPointerPattern;

public class reverseString {
    public static void main(String[] args)
    {
        Reverse();

    }
    public static void Reverse()
    {
       String s ="shradha" ;
       char[] arr = s.toCharArray() ;
       int n = s.length() ;
       int i = 0 ;
       int  j = n-1 ;
       while(i<j)
       {
           char temp = arr[i] ;
           arr[i] = arr[j] ;
           arr[j] = temp ;
           i++;
           j--;

       }
       System.out.print(new String(arr)) ;
    }
}
