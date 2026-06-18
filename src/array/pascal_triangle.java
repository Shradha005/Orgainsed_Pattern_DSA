package array;
import java.util.* ;

public class pascal_triangle {
    public static void main(String[] args) {
        System.out.print("Enter the row :");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.print("Enter the col :");
        int col = sc.nextInt();
        int ans = pascal(row,col) ;
        System.out.print(ans) ;
    }
//    This is the optimal solution when specific r and c given
    static int pascal(int row,int col)
    {
        int n = row-1 ;
        int r = col-1 ;
        int res = 1;
        for(int i = 0 ; i< r ; i++)
        {
            res = res*(n-i) ;
            res= res/(i+1) ;
        }
        return res ;
    }
//    now when whole row 
}
