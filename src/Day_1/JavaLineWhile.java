package Day_1;

public class JavaLineWhile {
    public static void main(String[] args) throws Exception {
        int i = 0;
        String javaString = "JAVA";
        String outString = "";
        while(i<10) {
            outString = outString + javaString + " ";
            i++;
        }
        System.out.println(outString.trim());
    }
}