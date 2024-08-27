package vcollections.vsets;

import java.util.LinkedHashSet;
import java.util.Set;
//Linkedhashset allows one null value
//Order is maintain in linkedhashset
//implements set interface

public class Vlinkedhashset {
    public static void main(String[] args) {
        Set<Integer> seter = new LinkedHashSet<>();
        seter.add(null);
        seter.add(1);
        seter.add(23);
        System.out.println(seter);

    }
}
