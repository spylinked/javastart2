package Day_1;

public class MultipTableFor {
    public static void main(String[] args) throws Exception {
        int random_int = (int)(Math.random() * (9 - 1 + 1) + 1);
        for (int multip_int = 1;multip_int < 10;multip_int++) {
            System.out.println(random_int + " * " + multip_int + " = " + random_int*multip_int);
        }
    }
}
