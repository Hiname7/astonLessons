import java.util.Arrays;

public class task9 {


    public static void diagonalArray(int a, int b) {
        int[][] myArray = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ( i == j){
                    myArray[i][j] = 1;
                }
            }

        }

        for (int[] row : myArray) {
            System.out.println("  " + Arrays.toString(row));

        }
    }
}
