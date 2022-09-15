package collections;

import java.util.*;
public class Solution7 {
    public static void main(String[] args) {
        Map<String, String> len = new HashMap<>();
        len.put("banana","grass");
        len.put("cherry","berry");
        len.put("pear","fruit");
        len.put("melon","vegetable");
        len.put("blackberry","berry");
        len.put("ginseng","root");
        len.put("strawberry","berry");
        len.put("toffee","flower");
        len.put("potato","tuber");
        for (Map.Entry<String, String> pair : len.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
    /*
    1. Create collection HashMap<String, String>
    2. Put there 10 pairs:
        banana - grass,
        cherry - berry,
        pear - fruit,
        melon - vegetable,
        blackberry - berry,
        ginseng - root,
        strawberry - berry,
        toffee - flower,
        potato - tuber
     3. Print all the collection to the console, each element from the new line
     Example:
        banana - grass
     */
}
