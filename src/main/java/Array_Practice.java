public class Array_Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int arr2[] = new int[10];
        Object[] lister = new Object[34];
        lister[0] = new String("Noice");
        lister[1] = 20;
        for(Object value:lister)
            System.out.println(value);
    }
}
