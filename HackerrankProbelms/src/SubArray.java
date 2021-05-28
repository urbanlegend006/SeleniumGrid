
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        /*List<Integer> arr = new ArrayList<>();
        arr = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(arr);*/
        /*
        [1 -2 4 -5 1]
        */
        int loop = scan.nextInt();
        int[] arr = new int[loop];
        for(int i=0; i<loop; i++){
            arr[i] = scan.nextInt();
        }
//      int[][] arr2D = new int[arr.size()][arr.size()];
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+= arr[j];
                if(sum<0) counter++;
            }
        }
        /*int counter = 0;
        for(int i=0; i<arr2D.length; i++){
            for(int j=0; j<arr2D[i].length; j++){
                if(arr2D[i][j]<0) counter++;
            }
        }*/

        System.out.println(counter);

    }
}