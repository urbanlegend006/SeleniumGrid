public class GoalParser {
    public static void main(String[] args) {
        String name = "(al)G(al)()()G";
        //System.out.println(name.replaceAll("\\(\\)", "o").replaceAll("\\(", "").replaceAll("\\)", ""));

        char[] charArr = name.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<charArr.length; i++){
            if(charArr[i] == '(' && (i + 1) < charArr.length && charArr[i + 1] == ')'){
                sb.append('o');
                i++;
            }else if(charArr[i] == '(' || charArr[i] == ')') {

            }else{
                sb.append(charArr[i]);
            }
        }

        System.out.println(sb);
    }


}
