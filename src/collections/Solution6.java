package collections;
import java.util.*;
public class Solution6 {
    public static void main(String[] args) {
        Set<String> len = new HashSet<>();
        len.add("banana");
        len.add("cherry");
        len.add("pear");
        len.add("melon");
        len.add("blackberry");
        len.add("ginseng");
        len.add("strawberry");
        len.add("toffee");
        len.add("potato");

        for (String s : len) {
            System.out.println(s);
        }
    }
    /*
    1. Create collection HashSet with type <String>
    2. Put 10 strings (banana, cherry, pear, melon, blackberry, ginseng, strawberry, toffee, potato)
    3. Print to the console this collection, each element from new line
    4. Pay attention to the order changed order of the strings
     */
}
