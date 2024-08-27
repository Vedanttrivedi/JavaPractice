package vcollections;
import java.lang.Comparable;
public class Log implements Comparable<Log>
{
    @Override
    public int compareTo(Log l1)
    {
        return Integer.parseInt(this.getTimestamp().split("-")[0])
                - Integer.parseInt(l1.getTimestamp().split("-")[0]);
    }
    private String name;
    private String timestamp;
    private String username;
    private LogStatus status = LogStatus.ok;

    public Log()
    {

    }
    public Log(String name,String timestamp,String username)
    {
        this.name = name;
        this.timestamp =timestamp;
        this.username = username;
    }

    @Override
    public String toString()
    {
        return  this.username + "\t" + this.timestamp + "\t" + this.status +"\t" +this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public LogStatus getStatus() {
        return status;
    }

    public void setStatus(LogStatus status) {
        this.status = status;
    }
}

enum LogStatus
{
    error,
    warning,
    ok
};
