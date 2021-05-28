import java.io.File;
import java.io.IOException;

public class testFile {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\test.txt");
        file.createNewFile();
    }
}
