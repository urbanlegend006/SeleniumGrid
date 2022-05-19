import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[15];
        Random random = new Random();
        for (int i=0; i<15; i++){
            intArray[i] = random.nextInt(1000);
        }
        System.out.println("The Original Array:");
        Arrays.stream(intArray).forEach(e -> System.out.print(e + "\t"));

        quickSort(intArray, 0, intArray.length - 1);

        System.out.println("\nThe QuickSorted Array:");
        Arrays.stream(intArray).forEach(e -> System.out.print(e + "\t"));
        System.out.println();
    }

    private static void quickSort(Integer[] intArray, int l, int h) {
        if (l < h) {
            int pivot = pivot(intArray, l, h);
            quickSort(intArray, l, pivot - 1);
            quickSort(intArray, pivot + 1, h);
        }
    }

    private static int pivot(Integer[] intArray, int l, int h) {
        int pivot = (l + h) / 2;
        int i = l;
        int j = h;
        try {
            while (i < j) {
                while (intArray[pivot] >= intArray[i] && i<=h-1)
                    i++;

                while (intArray[pivot] < intArray[j] && j>=l)
                    j--;

                if (i < j) swap(intArray, i, j);
            }
            swap(intArray, pivot, j);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\nBound Exception Happened : i = " + i + " | j = " + j + " | l = " + l + " | h = " + h);
        }
        return j;
    }

    private static void swap(Integer[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
