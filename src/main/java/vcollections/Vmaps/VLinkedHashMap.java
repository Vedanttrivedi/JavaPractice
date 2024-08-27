package vcollections.Vmaps;

import java.util.LinkedHashMap;
import java.util.Map;
//Linkedhashmap extends hashmap only difference is that it mainstains order
//Threashold is = size * load factor

public class VLinkedHashMap
{
    public static void main(String[] args)
    {
        Map<Integer,String> map = new LinkedHashMap<>(10,0.75f);
        map.put(null,"ds");

    }
}
