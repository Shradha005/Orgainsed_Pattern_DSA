package array;

import java.util.Arrays ;

public class matrixZero {
    static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {1, 1, 1}, {1, 1, 1}};
//        RowAndCol(matrix);

//        setZeroes(matrix);
        optimizedZeroes(matrix);
    }

    //optimized approach
    static void optimizedZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int Col0 = 1;
//here we only mark the row not convert it in zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
//                   mark the ith row = 0
                    arr[i][0] = 0;

//                   because here we take one extra box in 0th row
                    if (j != 0)
                        arr[0][j] = 0;
                    else
                        Col0 = 0;
                }
            }

        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] != 0) {
                    if (arr[0][j] == 0 || arr[i][0] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
//        here we handle the first row separately if there is 0 then make a row elements
//         0
        if (arr[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
//           if col 0 make the whole col zero

            if(Col0 == 0)
                for (int i = 0; i < m; i++)
                    arr[i][0] = 0;


            for (int[] num : arr) {
                System.out.print(Arrays.toString(num));
            }
        }
    }
}




    //    better Approach
//    static void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//         space complexity= m+ n;


//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (row[i] || col[j]) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//        for(int[] num:matrix)
//        {
//            System.out.print(Arrays.toString(num)) ;
//        }
//
//    }
//}

//    brute force
//   static void RowAndCol(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    for (int col = 0; col < n; col++) {
//                        if (matrix[i][col] != 0) {
//                            matrix[i][col] = -1;
//                        }
//                    }
//                    for (int row = 0; row < m; row++) {
//                       if (matrix[row][j] != 0) {
//                            matrix[row][j] = -1;
//                       }
//                    }
//               }
//            }
//       }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//               if (matrix[i][j] == -1) {
//                    matrix[i][j] = 0;
//               }
//           }
//       }
//       for (int[] row : matrix) {
//           for (int val : row) {
//               System.out.print(val + " ");
//           }
//          System.out.println();
//       }
//    }



