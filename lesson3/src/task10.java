import java.util.Arrays;

public class task10 {
    public static void twoArgument(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }

        System.out.println(Arrays.toString(myArray));
    }
}
