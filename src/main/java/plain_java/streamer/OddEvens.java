package streamer;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

public class OddEvens {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> maps = list.stream()
                                               .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(maps);
    }
}
