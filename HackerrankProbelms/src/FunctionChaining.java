import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args) {


        Function<Integer, Integer> multiplyTwo = x -> x*2;
        Function<Integer, Integer> plusOne = x -> x+1;
        Function<Integer, Integer> combined = multiplyTwo.andThen(plusOne).andThen(multiplyTwo);

        int result = combined.apply(5);
        System.out.println(result);
    }
}
