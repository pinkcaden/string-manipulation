import javax.xml.transform.Source;

public class StringManipulator {


    public static String toUpperCase(String lower) {

        String upper = "";
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (Business.LOW_TO_UP.containsKey(c)) {
                upper += Business.LOW_TO_UP.get(c);
            } else {
                upper += c;
            }
        }
        return upper;
    }

    public static String toLowerCase(String upper) {

        String lower = "";
        for (int i = 0; i < upper.length(); i++) {
            char c = upper.charAt(i);
            if (Business.UP_TO_LOW.containsKey(c)) {
                lower += Business.UP_TO_LOW.get(c);
            } else {
                lower += c;
            }
        }
        return lower;
    }
}


