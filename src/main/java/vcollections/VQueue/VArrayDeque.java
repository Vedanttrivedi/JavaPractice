package vcollections.VQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//ArrayDeque implement Deque(Double ended queue)
//We can perform insertion,updatetion,addition operations at the both ended
/*
* ArrayDeque
The ArrayDeque class implements a double-ended queue (deque) that allows elements to be added or removed from both ends efficiently. It is part of the java.util package.

Key Features:
Resizable Array: Internally, ArrayDeque uses a resizable array, which means it can grow or shrink as needed.
No Capacity Limit: It doesn’t have a fixed capacity, so it can grow as needed.
Fast Operations: It supports constant-time operations for adding, removing, and accessing elements from both ends of the queue.
Not Thread-Safe: It is not synchronized, so it is not thread-safe. If you need a thread-safe deque, consider using ConcurrentLinkedDeque.
* */
public class VArrayDeque
{
    public static void main(String[] args)
    {
        Deque<Integer> qq = new ArrayDeque<>();
        qq.offerFirst(12);
        qq.offerFirst(23);
        qq.pollFirst();
        qq.add(null);
        System.out.println(qq);
    }
}
