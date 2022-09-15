package collections;
import java.util.*;

public class Solution2 {
 /*   static int maxLength(ArrayList[] arr) {
        int len = 0;
         for (int i = 0; i < arr.length; i++) {

            if (len < arr[i].length()) {
                len = arr[i].length();
            }
        }
        return len;
    }

    static void maxStrings(String[] arr,int len) {
        Vector<String> ans = new Vector<String>();

        for (int i = 0; i < arr.length; i++) {
            if (len == arr[i].length()) {
                ans.add(arr[i]);
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add( in.next());
        }
        maxStrings(arr,maxLength(arr));
    }*/
 public static void main(String args[]) {
    ArrayList<String> arr = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int  longs = 0;
        for (int i = 0; i < 5; i++) {
        arr.add( in.next());
        String longest = arr.get(i);
        if (longs>longest.length()){
            longs = longest.length();
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
    3. Using loop find the longest string in the List
    4. Print to the console found string
    5. If there are several longest strings, print each of them.
     */
}
