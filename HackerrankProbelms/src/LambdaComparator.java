import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = list.stream()
                .max((e1,e2) -> e1-e2)
                .get();

        System.out.println(result);
    }
}
