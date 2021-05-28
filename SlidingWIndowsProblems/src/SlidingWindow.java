import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {

    public static void main(String[] args) {
        int[] a = {5,3,5,2,3,2,7};

        /*
        5 3 5 = 2
        3 5 2 = 3
        5 2 3 = 3
        2 3 2 = 2
        3 2 7 = 3
         */

        int k =3;

        long res = getUniqueValues(a, k);
        System.out.println(res);

    }

    private static long getUniqueValues(int[] a, int k) {

        //HashSet<Integer> set = new HashSet<>();
        Deque<Integer> dq = new ArrayDeque<>();
        long uniqueVal = -1;
        for (int i = 0; i <a.length; i++) {
           // int num = in.nextInt();
            //a[i] = num;
            dq.add(a[i]);

            if(dq.size() == k){
                uniqueVal = uniqueVal<dq.stream().distinct().count() ? dq.stream().distinct().count() : uniqueVal;
                dq.removeFirst();
            }
        }

        return uniqueVal;

    }
}
