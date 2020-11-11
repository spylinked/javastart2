package Day_1;

public class JavaLineFor {
    public static void main(String[] args) throws Exception {
        String javaString = "JAVA";
        String outString = "";
        for (int i = 0; i < 10; i++) {
            outString = outString + javaString + " ";
        }
        System.out.println(outString);
    }
}