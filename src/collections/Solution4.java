package collections;

import java.util.*;


public class Solution4 {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(0, in.next());
        }
        System.out.print(arr);
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List, each element to the beginning of this List
    3. Using loop, print all the items to the console from the List
     */
    }
}
