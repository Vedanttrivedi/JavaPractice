package Threader;

import java.util.*;
import java.util.stream.Stream;

public class Test
{
    public static void main(String[] args) {
        Map<Long, List<Integer>> map = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(30);
        map.put(1000L, ls);



        Map<Long, List<Integer>> map2 = new HashMap<>();
        map2.put(1001L, ls);
        map2.put(1001L,ls);
        map2.put(1002L,ls);
        map2.put(1000L,new ArrayList<>(Arrays.asList(1,2,3,5)));



        long mkey = 1000L;

        if(map2.get(mkey)!=null)
        {
            //new HashSet<>(map2.get(mkey)).addAll(map.get(mkey));
            System.out.println(new HashSet<>(map.get(mkey)).add(434));
            System.out.println(new HashSet<>(map2.get(mkey)).addAll(new HashSet<>(map.get(mkey))));
        }
        System.out.println(map2.get(mkey));
     }
}
//JsonObject
//Trieset
//Triemap