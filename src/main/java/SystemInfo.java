import java.lang.reflect.Method;

public class SystemInfo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Cores : "+rt.availableProcessors());
        long maxMemoryInBytes = rt.maxMemory();

        System.out.println(Runtime.class.getDeclaredMethods()[0]);
        for(Method str: Runtime.class.getDeclaredMethods())
        {
            System.out.println(str);
        }
    }
}
