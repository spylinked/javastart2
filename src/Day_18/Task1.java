package Day_18;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] intArray = new int[rnd.nextInt(10)+3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(contArraySumm(intArray, 0));
    }

    public static int contArraySumm(int[] intArray, int index){
        if(intArray.length == index)
            return 0;
        return intArray[index]+contArraySumm(intArray,index+1);
    }


}
