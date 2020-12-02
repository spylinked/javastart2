package Day_18;

public class Task2v2 {
    public static void main(String[] args) {

        System.out.println(appears7(797834657));
    }

    public static int appears7(int ourInt) {
        StringBuilder sb = new StringBuilder();
        sb.append(ourInt);

        if(Character.getNumericValue(sb.charAt(0)) == 7) {
            if (sb.deleteCharAt(0).length() > 0)
                return appears7(Integer.parseInt(sb.deleteCharAt(0).toString()))+1;
            else
                return 1;
        }
        if (sb.deleteCharAt(0).length() > 0)
            return appears7(Integer.parseInt(sb.deleteCharAt(0).toString()));
        else
            return 0;
    }
}
