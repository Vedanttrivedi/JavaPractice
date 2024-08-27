package oops;

import java.util.*;
import java.util.stream.Collectors;

public class Cooler {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        }

        Map<Integer, List<Integer>> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getKey() % 2 == 0)
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue().stream()
                                .filter(val -> val % 2 != 0)
                                .collect(Collectors.toList())
                ));

        System.out.println(filteredMap);
    }
}