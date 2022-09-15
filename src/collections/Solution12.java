package collections;
import java.util.*;
public class Solution12 {
    public static void main(String args[]){
        ArrayList<Integer> len = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            len.add(r.nextInt(20));
        }

        for (int i = 0; i < len.size(); i++){
          if (len.get(i) < 10) {
            len.remove(i);
            i--;
          }
        }
    System.out.println(len);
    }
    /*
    1. Create Set<Integer>
    2. Add there 20 different numbers
    3. Remove from the set all the numbers bigger than 10
     */
}
