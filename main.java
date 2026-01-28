import java.util.Random;
import java.util.random.*;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(array_maker(10)));
        
    } public static int[] array_maker(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }
}
