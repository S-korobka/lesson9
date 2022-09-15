package collections;

import java.util.*;
import java.util.LinkedList;
public class Solution5 {
    public static void main(String args[]) {
        LinkedList<String> arr = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(in.next());
        }
        for (int i = 0; i < 13; i++) {
            arr.addFirst(arr.getLast());
            arr.removeLast();
        }
        System.out.print(arr);
    }
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Remove the last element and put it to the beginning of the List, Repeat 13 times
    4. Using loop, print all the items to the console from the List
     */
}
