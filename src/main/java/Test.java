public class Test {
    int id;
    public static void main(String[] args) {
        // Create an instance of the DemoObject class
        Test t1 = new Test();
        DemoObject obj1 = new DemoObject("Object1");
        DemoObject obj2 = new DemoObject("Object2");

        printMemoryStatus();
        // obj1 is no longer referenced
        obj1 = null;
        System.out.println("Afterer");
        printMemoryStatus();
        // Suggest the JVM to perform garbage collection
        System.gc();

        // Create more objects
        DemoObject obj3 = new DemoObject("Object3");
        DemoObject obj4 = new DemoObject("Object4");

        // Print memory status
        printMemoryStatus();
    }

    private static void printMemoryStatus() {
        Runtime runtime = Runtime.getRuntime();
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        System.out.println("Used Memory: " + usedMemory / 1024 + " KB");
        System.out.println("Max Memory: " + maxMemory / 1024 + " KB");
    }
}

class DemoObject {
    private String name;

    public DemoObject(String name) {
        this.name = name;
        System.out.println("Created: " + name);
    }

    @Override
    public void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("deleted "+name);
    }
}
