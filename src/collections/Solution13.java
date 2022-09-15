package collections;
import java.util.*;
public class Solution13 {
    public static void main(String[] args) {
        Map<String, String> len = new HashMap<>();
        len.put("Khvylovy","Mykola");
        len.put("Shevchenko","Taras");
        len.put("Ukrainka","Lesya");
        len.put("Bahrianyi","Ivan");
        len.put("Nechuy-Levytsky","Ivan");
        len.put("Kotliarevsky","Ivan");
        len.put("Franko","Ivan");
        len.put("Kotsiubynsky","Mykhailo");
        len.put("Dovzhenko","Alexander");
        len.put("Karpenko-Kary","Ivan");
        Map<String, String> len1 = new HashMap<>();
        for (Map.Entry<String, String> pair : len.entrySet()) {
            len1.put(pair.getValue(),pair.getKey());

        }

        for (Map.Entry<String, String> pair : len1.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key +  "\n"  + value);
        }

      /*  ArrayList l2 = new ArrayList();

        Iterator iterator = len.values().iterator();

        while (iterator.hasNext())
        {
            String o = (String) iterator.next();
            if(!l2.contains(o)) l2.add(o);

        }*/

    }
    /*
    1. Create Map<String, String>
    2. Put there 10 elements (key-Surname, value-Name)
    3. Remove people who have the same names
    4. Print the result, each element from new line
     */
}
