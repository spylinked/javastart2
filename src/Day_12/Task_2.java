package Day_12;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i <= 350; i++) {
            if(i%2 == 0 && (i<=30 || i>=300)){
                numList.add(i);
            }
        }
        System.out.println(numList);
    }
}
