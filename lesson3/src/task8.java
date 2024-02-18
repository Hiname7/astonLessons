import java.util.Arrays;

public class task8 {
    public static void multiplyArray(){
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("  до:    " + Arrays.toString(myArray));
        for (int i = 0; i < 12; i++) {
            if (myArray[i] < 6){
                myArray[i] = myArray[i] * 2;
            }

        }
        System.out.println("  после: " + Arrays.toString(myArray));
    }
}
