package collections;

import java.util.*;

public class Solution3 {


    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int  shor = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            arr.add( in.next());
            String shortest = arr.get(i);
            if (shor>shortest.length()){
                shor = shortest.length();
            }

        }
        String shortest = arr.get(0);
        for(String str : arr) {
            if (str.length() == shortest.length()) {
                System.out.println(str);
            }
        }


    }
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Using loop find the shortest string in the List
    4. Print to the console found string
    5. If there are several shortest strings, print each of them.
     */
}
