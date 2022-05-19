import java.util.Arrays;

public class Print1To100 {

    public static void main(String[] args) {

        Object[] obj = new Object[100];

        Arrays.fill(obj, new Object(){
                int count = 0;
                @Override
                public String toString(){
                    return String.valueOf(++count);
                }
        });

        System.out.println(Arrays.toString(obj));


    }
}
