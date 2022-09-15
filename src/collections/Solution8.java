package collections;
import java.util.*;
public class Solution8 {
    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }
}
    public static void main(String[] args) {
        Cat cat1 = new Cat("Markiz");
        Cat cat2 = new Cat("Mosy");
        Cat cat3 = new Cat("Sirko");
        Cat cat4 = new Cat("Dik");
        Cat cat5 = new Cat("Zopa");
        Cat cat6 = new Cat("Barak");
        Cat cat7 = new Cat("Biza");
        Cat cat8 = new Cat("Rom");
        Cat cat9 = new Cat("Myrka");
        Cat cat10 = new Cat("Marusy");

        Map<String, Cat> len = new HashMap<>();
        len.put(cat1.name,cat1);
        len.put(cat2.name,cat2);
        len.put(cat3.name,cat3);
        len.put(cat4.name,cat4);
        len.put(cat5.name,cat5);
        len.put(cat6.name,cat6);
        len.put(cat7.name,cat7);
        len.put(cat8.name,cat8);
        len.put(cat9.name,cat9);
        len.put(cat10.name,cat10);

        for (Map.Entry<String, Cat> pair : len.entrySet()) {
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key +  "\n"  + value);
        }
    }
    /*
    1. Create the class Cat with variable name
    2. Create HashMap<String, Cat>
    3. Add to the map 10 cats, as a key, use the name of the Cat
    4. Print to the console each element from new line
     */
}
