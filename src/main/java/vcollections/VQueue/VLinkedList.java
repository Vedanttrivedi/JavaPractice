package vcollections.VQueue;

import java.util.LinkedList;
import java.util.Queue;

public class VLinkedList
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(23);//throws exception if the capacity is full
        q.offer(25);//returns false if the capacity is full

        System.out.println(q.peek());
        q.remove();//removes the element from queue throws exception if it is empty
        q.poll();//removes the element from queue,returns null if is empty
        System.out.println(q);
        for(int i=1;i<=100;i++)
            q.add(i);
        System.out.println(q);
    }
}
