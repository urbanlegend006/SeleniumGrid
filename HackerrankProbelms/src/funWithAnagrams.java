import java.util.*;

public class funWithAnagrams {

    public static void main(String[] args) {
        String[] str = {"code", "doce", "eocd", "framer", "frame"};
        List<String> sample = Arrays.asList(str);

        List<String> ans = fnAnag(sample);
        for(String s : ans){
            System.out.print(s + "   ");
        }
    }

    private static List<String> fnAnag(List<String> str) {
        List<String> ans = new ArrayList<>();
        HashSet<String> setWords = new HashSet<>();

        for(int i=0; i<str.size(); i++){

            String word = sort(str.get(i));

            if(!setWords.contains(word)){
                setWords.add(word);
                ans.add(str.get(i));
            }
        }
        Collections.sort(ans);
        return ans;
    }

    private static String sort(String s) {
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
