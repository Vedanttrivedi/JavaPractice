package vcollections.Vmaps;

import javax.lang.model.type.IntersectionType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VHashMap {

    public static void main(String[] args) {
        Map<String,Integer> studentAges = new HashMap<>();
        studentAges.put("Vedant",22);
        studentAges.put("ABCD",12);

        boolean ans = studentAges.containsKey("Vedant");
        boolean ans2 = studentAges.containsValue(22);

        studentAges.remove("ABCD");

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(studentAges.put("Vedant",24));//output will be still 22 on this line
        System.out.println(studentAges.get("Vedant"));//output will be 24 in this line
        studentAges.put("Virat",26);
        //different way to print map
        //printUsingIterator(studentAges);
        printUsingEntry(studentAges);
        printUsingKeySet(studentAges);
        System.out.println("Using foreach lambda");
        studentAges.forEach((key,value) -> System.out.println(key+"\t"+value));
        findDuplicates(new int[]{1,2,3,1,2,4});
    }

    private  static void findDuplicates(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
//        for(int value:arr)
////        {
////            if(map.get(value)!=null)
////            {
////                int vl = map.get(value);
////                map.put(value,++vl);
////                continue;
////            }
////            map.put(value,1);
//        }
        //above lines to find frequencey can be converted to one line
        for(int value: arr)
        {
            map.merge(value,1,Integer::sum);
          /*  map.compute(value,(k,v) -> v==null ? 1:v+1);*/
            /*int geter = map.getOrDefault(value,0);
            map.put(value,geter+1);*/
           /* map.putIfAbsent(value,0);
            map.replace(value,map.get(value)+1);*/


        }
        printUsingIterator(map);


    }

    private  static  void printUsingIterator(Map<Integer, Integer> map)
    {
        //iterator also allows to remove element while traversinig using iterator.remove()

        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer,Integer> local = iterator.next();
            System.out.print(local.getKey()+":"+local.getValue());
            System.out.println();
        }
    }

    private static void printUsingEntry(Map<String,Integer> map)
    {
        System.out.println();
        for(Map.Entry<String,Integer> local : map.entrySet())
        {
            System.out.println(local.getKey() +"\t" + local.getValue());
        }
    }
    private static void printUsingKeySet(Map<String,Integer> map)
    {
        for(String key : map.keySet())
        {
            System.out.println(key +"\t" +map.get(key));
        }
    }


}
