package array;

//Array is sorted or not
class practise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5};
        boolean result =
                issorted(arr);
        System.out.println(result) ;

    }

    static boolean issorted(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i ] > arr[i+1]) {

              return false ;

            }

        }
      return true ;
    }
}

