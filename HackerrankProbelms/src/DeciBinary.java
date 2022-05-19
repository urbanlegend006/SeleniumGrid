import java.util.ArrayList;
import java.util.List;

public class DeciBinary {

        public static int minPartitions(String n) {
            char max  = '0';
            for (char c : n.toCharArray()){
                if (c>max)
                    max=c;
            }

            return max - '0';
        }

    public static void main(String[] args) {
        String n = "27346209830709182346";

        System.out.println(minPartitions(n));
    }

}
