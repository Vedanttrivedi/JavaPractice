package vcollections.vsets;

import java.util.Set;
import java.util.TreeSet;

//Treeset is used to maintain sorted order
//Treeset is used red black tree internally to maintain sorting
//Time complexity for operations is o(log n)
//Does not allow null values

public class Vtreeset {
    public static void main(String[] args) {
        Set<Integer> seter = new TreeSet<>();
        seter.add(1);
        seter.add(-12);
        seter.remove(-12);
        System.out.println(seter.contains(1));
    }
}
