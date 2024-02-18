public class task5 {
    public static boolean leapYear( int a){
        int i = 0;
        if (a % 100 == 0 ){
            i++;
            return false;
        }
        if (i == 4){
            return true;
        }
        if (a % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
