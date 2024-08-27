package dsa_practice;
import java.util.*;

public class LRU_Cache
{
  public static void main(String[] args)
  {
      int[] elements = {1,2,3,4,5,6,7,8,9,10};
      LRU<Integer> cache = new LRU(2);

      for (int i = 1; i <=10; i++)
        cache.push(i,i*10);

      cache.push(11,11);
      cache.push(11,12);
      cache.get(10);
      cache.push(12,12);
      System.out.println(cache.pairs);


      LinkedList<Integer> lister = new LinkedList<>();

  }
}





class Pair
{
  int key;
  int value;
  Pair(int k,int v)
  {
    key=k;
    value=v;
  }

  @Override
  public String toString() {
    return "Pair{" +
      "key=" + key +
      ", value=" + value +
      '}';
  }
}

class LRU<K>
{
  ArrayList<Pair> pairs;
  int maxSize;

  LRU(int size)
  {
    maxSize = size;
    pairs = new ArrayList<>(size);
  }


  public int get(int key)
  {
    for (int i = 0; i < pairs.size() ; i++)
    {
      Pair obj = pairs.get(i);

      if(obj.key==key)
      {
        pairs.remove(obj);
        pairs.add(new Pair(obj.key,obj.value));
        System.out.println(pairs);
        return obj.value;
      }
    }
    return -1;
  }


  public void push(int key,int value)
  {
    //first check if the key is already present or not
    //if it is already present then update its value

    for (int i = 0; i < pairs.size() ; i++)
    {
      Pair local = pairs.get(i);
      if(local.key==key)
      {
        pairs.remove(local);
        pairs.add(new Pair(key,value));
        return;
      }
    }
    if(pairs.size()==maxSize)
    {
      pairs.remove(0);
      pairs.add(new Pair(key,value));
      return;
    }
    pairs.add(new Pair(key,value));
  }
}
