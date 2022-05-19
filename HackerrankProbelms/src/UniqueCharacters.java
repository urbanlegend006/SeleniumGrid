//UniqueCharacters
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getUniqueCharacter' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getUniqueCharacter(String s) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }else
                map.put(arr[i], map.get(arr[i])+1);
        }
        List<Character> charList = new ArrayList<>();

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                charList.add(e.getKey());
            }
        }

        if (charList.size()==0)
            return 0;

        charList.stream()
                .sorted()
                .forEach(e -> System.out.print(e + " "));

        return 0;
    }

}

public class UniqueCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int result = Result.getUniqueCharacter(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

