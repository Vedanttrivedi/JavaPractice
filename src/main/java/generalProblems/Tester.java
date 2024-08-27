package generalProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Tester
{
    public static void main(String[] args)
    {
        Map<Integer, Map<String,String>> map  = new HashMap<>();

        Map<String,String> local;
        for (int i = 1; i < 5; i++)
        {
            map.put(i,new HashMap<>());
             local = map.get(i);
            if(i==1)
            {
                local.put("QQA","OMM");
                local.put("BTS","WPT");
                local.put("QJH","FTZ");
            }
            else if(i==2)
            {
                local.put("VHE","HME");
                local.put("LJW","IUQ");
                local.put("LAO","IAX");
            }
            else if(i==3)
            {
                local.put("LVE","MWG");
                local.put("EWL","XEZ");
                local.put("AMX","YEY");
            }
            else if(i==4)
            {
                local.put("RDD","EEJ");
                local.put("IKF","XJZ");
                local.put("XSC","QQj");
            }
        }
        System.out.println("map data ");
        System.out.println(map);

        System.out.println(map.entrySet());
        Map<String, String> resultMap = map.values().stream()
                .flatMap(lmap -> lmap.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (existing, replacement) -> existing));
        System.out.println(resultMap);
    }
}
