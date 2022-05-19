import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class timeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String label = s.substring(8);
        Integer hour = Integer.parseInt(s.substring(0, 2));

        if (label.equals("PM")) {
            if (hour == 12) {
                return s.substring(0, 8);
            }
            hour = hour + 12;
            return hour + s.substring(2, 8);
        }

        if (label.equals("AM")) {
            if (hour == 12) {
                return "00" + s.substring(2, 8);
            } else {
                return s.substring(0, 8);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }
}