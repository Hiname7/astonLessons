import java.util.Arrays;

public class task7 {
    public static void createArray() {
        int[] myArray;
        myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i+1;
        }
        System.out.println("  "+ Arrays.toString(myArray));
    }
}
