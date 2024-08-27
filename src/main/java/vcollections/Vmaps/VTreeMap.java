package vcollections.Vmaps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
//Treemap is used to maintain order
//Navigablemap is used to maintain order in reverse order (if used descendingmap)

public class VTreeMap
{
    public static void main(String[] args)
    {
        Map<Integer,Integer> map = new TreeMap<>();
        map.put(1,23);

        map.put(-1,25);
        System.out.println(map);

        NavigableMap<Integer,Integer> nmap = new TreeMap<>();
        nmap = nmap.descendingMap();
        nmap.put(23,34);
        nmap.put(30,35);

        System.out.println(nmap);

        SortedMap<Integer,Integer> smap = new TreeMap<>();
        smap.put(1,23);
        smap.put(2,34);

        System.out.println(smap);
    }
}
