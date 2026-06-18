package array;

public class common {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5, 7, 8};
        int[] brr = {2, 6, 8, 9, 10, 11};
        System.out.println(swap(arr, brr));
    }

    static int swap(int[] arr, int[] brr) {
        for (int i = 0; i <=arr.length - 1; i++) {
            for (int j = 0; j <=arr.length - 1; j++) {
                if (arr[i] == brr[j]) {
                    System.out.println("common elements " + arr[i]);
                }
            }
        }
        return -1 ;
    }
}
