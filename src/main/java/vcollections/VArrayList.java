package vcollections;

public class VArrayList
{
    public static void main(String[] args)
    {
        VArrayListLogService service = new VArrayListLogService();
        service.add("Logged In","Jul 19 19:08","Vedant");
        service.add("Attempt to Login","Jul 19 19:08","Root");

        service.add("Logged out","Jul 19 19:38","Vedant");
        //service.showLogs();
        service.get("Jul 19 19:08","Vedant");
        System.out.println("------------");
        service.get("Jul 19 19:08");
    }
}
