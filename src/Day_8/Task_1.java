package Day_8;

public class Task_1 {
    public static void main(String[] args) {
        long start, end;
        String concated1 = "";
        StringBuilder concated2 = new StringBuilder();
/*-----------------------------------------*/
        start = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            concated1 = concated1 + " " + i;
        }
        end = System.nanoTime();
        System.out.println(concated1);
        System.out.println(end-start);
/*-----------------------------------------*/
        start = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            concated2.append(i + " ");
        }
        end = System.nanoTime();
        System.out.println(concated2);
        System.out.println(end-start);
/*-----------------------------------------*/
        start = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            System.out.print(i + " ");
        }
        end = System.nanoTime();
        System.out.println();
        System.out.println(end-start);
/*-----------------------------------------*/

    }
}
