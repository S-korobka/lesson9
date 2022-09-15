package collections;
import java.util.*;

public class Solution9 {
    public static void main(String[] args) {
        Map<String, String> len = new HashMap<>();
        len.put("1", "G#");
        len.put("2", "C#");
        len.put("3", "F#");
        len.put("4", "B");
        len.put("5", "E");
        len.put("6", "A");
        len.put("7", "D");
        len.put("8", "G");
        len.put("9", "B");
        len.put("10", "E");

        for (Map.Entry<String, String> pair : len.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
        }
    }
    /*
    1. Create collection of HashMap<String, String>
    2. Put 10 Strings there
    3. Print the list of Keys, each key from the new line
     */
}
