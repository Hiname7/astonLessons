import java.util.Arrays;
import java.util.Random;

public class task6 {
    public static void changeArray(int a){
        Random rand = new Random();
        int[] myArray = new int[a];
        for (int i = 0; i < a ; i++) {
            myArray[i] = rand.nextInt(2);
        }
        System.out.print("  до:    ");
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < a; i++) {
            if (myArray[i] == 0){
                myArray[i] = 1;
            }
            else{
                myArray[i] = 0;
            }

        }

        System.out.print("  после: ");
        System.out.println(Arrays.toString(myArray));

    }
}
