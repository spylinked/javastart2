package Day_1;

public class MultipTableWhile {
    public static void main(String[] args) throws Exception {
        int random_int = (int)(Math.random() * (9 - 1 + 1) + 1);
        int multip_int = 1;
        while (multip_int < 10) {
            System.out.println(random_int + " * " + multip_int + " = " + random_int*multip_int);
            multip_int++;
        }
        
    }
}
