package vcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VArrayListLogService
{
    private final List<Log> logs;
    VArrayListLogService()
    {
        logs = new ArrayList<>();
    }
    public void add(String name,String timestamp,String username)
    {
        logs.add(new Log(name,timestamp,username));
    }

    public void showLogs()
    {
        System.out.println("Logs");
        System.out.println("------------------");
        Iterator<Log> it = logs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    public void delete(String name,String timestamp)
    {

    }
    public void get(String timestamp)
    {
        Iterator<Log> it = logs.iterator();
        while(it.hasNext())
        {
            Log currentLog = it.next();
            if(currentLog.getTimestamp().equals(timestamp))
                System.out.println(currentLog);
        }
    }
    public void get(String timestamp,String username)
    {
        Iterator<Log> it = logs.iterator();
        while(it.hasNext())
        {
            Log currentLog = it.next();
            if(currentLog.getTimestamp().equals(timestamp) && currentLog.getUsername().equals(username))
                System.out.println(currentLog);
        }
    }
    public void removeByUsername(String username){
        //remvoveIf
        logs.removeIf(obj -> obj.getUsername().contains(username));
    }
}
