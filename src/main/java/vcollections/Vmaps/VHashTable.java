package vcollections.Vmaps;

import java.util.Hashtable;
//hashtable is thread safe vs hashmap is not thread safe
//hastable cannot contain null key vs hashmap can contain one null key
public class VHashTable
{
    public static void main(String[] args)
    {
        Hashtable<Integer,Integer> table = new Hashtable<>();
        table.put(1,23);
        table.put(2,34);

    }
}
