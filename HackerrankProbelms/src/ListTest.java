import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {


    public static void main(String[] args) {
        String[] list = {"list1", "list2", "list3", "list4"};
        System.out.println("Before method: ");
        Arrays.stream(list).forEach(System.out::println);

        removeElement(list);

        System.out.println("After method");
        Arrays.stream(list).forEach(System.out::println);
    }

    private static void removeElement(String[] list1) {
        //List<String> list = list1;
        String[] list = list1;
        list[0] = "Anit";
        System.out.println("inside method");
        Arrays.stream(list).forEach(System.out::println);
    }

}
