import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Code 
{

    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        LinkedHashMap<Integer,Integer> linker = new LinkedHashMap<>();
        linker.put(1,10);
        linker.put(2,10);
        linker.put(3,10);
        System.out.println(linker);
    }    
}
class LRU<T>
{
    Queue<T>cache;
    public LRU(int size)
    {
        cache = new LinkedList<>();
    }
    public void getElement(T key)
    {

    }
}