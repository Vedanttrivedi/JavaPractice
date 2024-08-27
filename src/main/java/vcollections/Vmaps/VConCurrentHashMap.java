package vcollections.Vmaps;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
/*
* 1. Concurrency Handling

* ConcurrentHashMap:
Designed for concurrent access by multiple threads.
It uses a segmented locking mechanism (or a lock striping approach) to ensure thread-safe operations. In Java 8 and later, it uses a more sophisticated mechanism with lock-free operations for some methods, improving performance and scalability.
Allows concurrent reads and updates without blocking other threads.
Provides finer-grained concurrency control, which helps in achieving better performance in highly concurrent environments.

* Hashtable:
Synchronized by default, meaning that all methods are synchronized to ensure thread safety.
Locks the entire table for every method call, which can lead to contention and reduced performance in a multi-threaded environment.
Since it's synchronized, it can be slower than ConcurrentHashMap under high contention.

* 2. Null Keys and Values
ConcurrentHashMap:

Does not allow null keys or values. Attempting to use null will result in a NullPointerException.
This design choice helps to avoid ambiguity and simplifies concurrent behavior.
Hashtable:

Also does not allow null keys or values. This was a design choice made in the early days of Java to ensure consistent behavior across different methods.
3. Performance
ConcurrentHashMap:

Generally offers better performance in concurrent scenarios due to its non-blocking mechanisms and fine-grained locking.
Optimized for high concurrency and provides better scalability in a multi-threaded environment.
Hashtable:

Performance can be less optimal due to its coarse-grained synchronization (locking the entire table for each method call).
Typically used in older codebases and less suitable for modern applications requiring high concurrency.
4. Legacy Status
ConcurrentHashMap:

Part of the Java Collections Framework introduced in Java 5 as part of the java.util.concurrent package.
Designed to replace Hashtable in many cases, providing better concurrency control and performance.
Hashtable:

Part of the original Java 1.0 and is considered a legacy class.
It is generally recommended to use ConcurrentHashMap instead of Hashtable for new code.
*
* */
public class VConCurrentHashMap
{
    public static void main(String[] args)
    {
        ConcurrentHashMap<String,Integer> vconmap = new ConcurrentHashMap<>();
        vconmap.put("Noice",23);
        vconmap.forEach((k,v)-> System.out.println(k+"\t"+v));
    }

}
