package Practise_allpattern;

public class MergerSort {
    public static void main(String[] args) {

        int[] m = {9, 8, 7, 3, 2};

        int n = m.length;
        Mergee(m, 0, n - 1);
        for(int i = 0; i< n ; i++)
        {
            System.out.print(m[i] + " ") ;
        }
        System.out.println() ;

    }

    public static void Mergee(int []a , int s , int e)
    {
        if(s>=e)
            return ;
        int mid = s + ( e-s)/2 ;
        Mergee(a,s,mid) ;
        Mergee(a,mid+1 , e) ;
        conquer(a,s,mid,e) ;

    }
    public static void conquer(int[] a, int start , int mid , int end )
    {
        int Merged [] = new int[end - start + 1] ;
        int idx1  = start ;
        int idx2 = mid +1 ;
        int x = 0 ;

        while(idx1 <= mid && idx2 <= end )
        {
            if(a[idx1] <= a[idx2])
            {
                Merged[x] = a[idx1] ;
                x++;
                idx1++;

            }
            else {
                Merged[x] = a[idx2] ;
                x++;
                idx2++;
            }
        }
        while(idx1<=mid)
        {
            Merged[x++] = a[idx1++] ;
        }
        while(idx2 <= end)
        {
            Merged[x++] = a[idx2++]  ;
        }


        for(int i= 0 , j = start ; i<Merged.length ; i++ , j++)
        {
            a[j] = Merged[i] ;
        }

    }
}