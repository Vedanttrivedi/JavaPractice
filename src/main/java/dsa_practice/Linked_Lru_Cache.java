package dsa_practice;

import java.util.HashMap;
import java.util.Map;

public class Linked_Lru_Cache
{
  public static void main(String[] args)
  {
    HashMap<Integer,Node> = new HashMap<>();
  }
}

class Node
{
  int key;
  int value;
  Node next,prev;
  Node(int key,int value)
  {
    this.key = key;
    this.value=value;
  }
}
class LRUCache
{
  //Constructor for initializing the cache capacity with the given value.
  static class Node
  {
    int key;
    int value;
    Node next,prev;
    Node(int key,int value)
    {
      this.key = key;
      this.value=value;
    }
  }
  static Map<Integer,Node> map;
  static Node head,tail;
  static int capacity;
  static int count;
  LRUCache(int cap)
  {
    head  = new Node(0,0);
    tail = new Node(0,0);
    map = new HashMap<>();
    capacity = cap;
    count=0;
    head.next=tail;
    tail.next=null;
    head.prev=null;
    tail.prev=head;
  }

  private static void insertAtFirst(Node node)
  {
    node.next=tail;
    tail.prev=node;
    head.next=node;
    node.prev=head;
  }
  private static void remove(Node node)
  {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }
  //Function to return value corresponding to the key.
  public static int get(int key)
  {
    return 1;
  }

  //Function for storing key-value pair.
  public static void set(int key, int value)
  {
    if(map.get(key)!=null)
    {
      Node temp =map.get(key);
      temp.value = value;
      remove(temp);
      map.put(key,temp);
      insertAtFirst(temp);
    }
    else
    {
      Node temp = new Node(key,value);
      map.put(key,temp);
      if(count==capacity)
      {
        //remove the least used node
        map.remove(tail.prev.key);
        remove(tail.prev);
        insertAtFirst(temp);
      }
      else
      {
        //node is coming first time
        insertAtFirst(temp);
        count++;
      }
    }
  }
}
