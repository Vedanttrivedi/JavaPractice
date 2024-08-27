package vcollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) {
        //Arraylist to array
        List<Integer> list = Arrays.asList(12,23);
        Integer[] data = list.stream().toArray(Integer[]::new);
        System.out.println(data[0]);
        list = Collections.synchronizedList(list);
        List<Integer> datas = Arrays.asList(data);
    }
}
