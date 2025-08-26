import java.util.*;

public class Business {

    public static HashMap<Character, Character> LOW_TO_UP = createMap("up");
    public static HashMap<Character, Character> UP_TO_LOW = createMap("low");
    
    private static HashMap<Character, Character> createMap(String choice) {

        HashMap<Character, Character> ret = new HashMap<>();

        char[] low = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] up = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        if (choice.equals("up")) {
            for (int i = 0; i < 26; i++) {
                ret.put(low[i], up[i]);
            }

        } else if (choice.equals("low")) {
            for (int i = 0; i < 26; i++) {
                ret.put(up[i], low[i]);
            }
        }
        return ret;
    }
}

