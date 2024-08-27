package vcollections.VQueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/*
* The ConcurrentLinkedQueue class implements a thread-safe queue based on a non-blocking linked-node algorithm. It is part of the java.util.concurrent package.

Key Features:
Thread-Safe: It is designed to be used in concurrent environments where multiple threads can add or remove elements simultaneously.
Non-Blocking: It uses a lock-free algorithm, which allows for high concurrency and performance under load.
Unbounded: It does not have a fixed capacity and can grow as needed.
FIFO Order: It maintains the order of elements in a first-in, first-out manner.

* */
public class VConcurrentLinkedQueue
{
    public static void main(String[] args)
    {
        Queue<Integer>qs = new ConcurrentLinkedQueue<>();
        qs.add(34);

    }
}
