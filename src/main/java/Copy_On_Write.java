import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copy_On_Write
{
    private List<Integer> data;
    Copy_On_Write()
    {
        data = new CopyOnWriteArrayList<>();
    }

    public void add(int value)
    {
        data.add(value);
    }
    public  void show()
    {
        Iterator<Integer> it = data.iterator();
        while(it.hasNext())
        {
            int val =it.next();
            it.remove();
            System.out.println("removed "+val);
        }

//        for(Integer value: data)
//        {
//            data.remove(value);
//        }
//
//        for(Integer value: data)
//        {
//            System.out.println(value);
//        }
        System.out.println("size "+ data.size());
    }
}
