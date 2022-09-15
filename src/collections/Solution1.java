package collections;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {

        ArrayList days = new ArrayList();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");

        System.out.println("Size of String ArrayList : " + days.size());
        printArrayListElements(days);
    }

    public static void printArrayListElements(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    /*
    1. Create List of Strings
    2. Add 5 different strings
    3. Print to the console the size of the List
    4. Using loop, print all the items to the console from the List
     */
}
