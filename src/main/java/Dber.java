import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class Dber
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ls = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>>map = new HashMap<>();
        for (int i = 1; i <=10 ; i++) {
            ls.add(i);
        }
        for (int i = 1; i <= 10; i++) {
            map.put(i,ls);
        }
        System.out.println(map);

//        for(HashMap.Entry<Integer,ArrayList<Integer>> maper:map.entrySet())
//        {
//            if(maper.)
//        }
      Map<Integer,ArrayList<Integer>> lser =new HashMap<>();

//        ls.stream().filter(value ->value%2==0).forEach(value->{
//            lser.put(value,new ArrayList<>());
//            map.get(value).stream().filter(val -> val%2!=0).forEach(val->{
//                lser.get(value).add(val);
//            });
//        });
//        System.out.println(lser);
//
//        Map<Integer, ArrayList<Integer>> filteredMap = map.entrySet().stream()
//                .filter(entry -> entry.getKey() % 2 == 0)
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        entry -> entry.getValue().stream()
//                                .filter(val -> val % 2 != 0)
//                                .collect(Collectors.toList())
//                ));
//
//        // Print the result
       // System.out.println(filteredMap);
    }
}
