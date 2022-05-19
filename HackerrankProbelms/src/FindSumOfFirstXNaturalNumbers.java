import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FindSumOfFirstXNaturalNumbers {

    public static void main(String[] args) {

        /*
            Find the sum of the first X natural numbers.
            X =100, 50, 1000 any integer

            Constraints : We cannot use Loops and Recursions

         */
        //input
        Integer[] listOfNumbers = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //Sum of first n integers is = n(n+1)/2
        //n =15
        //Solution 15(15+1)/2= 15 * 8 = 120
        //Solution of sum from 1 to 100 = 100(100+1)/2 = 5050

        List<Integer> newIntegerList = new ArrayList<>(); // This list will hold values from 1 to 100

        for(int i = 1; i<=100; i++){
            newIntegerList.add(i);
        }

        //Solution
        List<Integer> intList = new ArrayList<>(Arrays.asList(listOfNumbers));

        BinaryOperator<Integer> getSum = (acc, x) -> acc+x;

        int solution  = intList
                .stream()
                .reduce(0, getSum);

        System.out.println("The solution is " + solution);

        System.out.println("\n*********************************************\n");

        int solution1  = newIntegerList
                .stream()
                .reduce(0, getSum);

        System.out.println("The solution is " + solution1);

    }
}
