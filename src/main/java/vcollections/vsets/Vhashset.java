package vcollections.vsets;

import vcollections.Log;

import java.util.HashSet;
import java.util.Set;

public class Vhashset {
    public static void main(String[] args) {
        Set<Integer> logs = new HashSet<>();
        logs.add(1);
        boolean ans = logs.contains(1);
        System.out.println(ans);
    }
}
