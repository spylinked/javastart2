package Day_18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(appears7(797834657));
    }

    public static int appears7(int ourInt) {
        String intStr = Integer.toString(ourInt);
        String intStrSub = intStr.substring(1);

        if(Character.getNumericValue(intStr.charAt(0)) == 7) {
            if (intStrSub.length() > 0)
                return appears7(Integer.parseInt(intStrSub))+1;
            else
                return 1;
        }
        if (intStrSub.length() > 0)
            return appears7(Integer.parseInt(intStrSub));
        else
            return 0;
    }
}
