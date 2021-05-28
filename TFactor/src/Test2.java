
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString="abcabc";
	    System.out.println(operationCount(originalString,1,1));
	}

	private static int operationCount(String word, int input1, int input2) {
		// TODO Auto-generated method stub
	    int turn = 0;
	    int len = 0;
	    String PO = null;
	    String QO = null;
	    String text = word;
	    len = word.length();
	    do{
	      PO = text.substring(len - input1, len).concat(text.substring(0, len -input1));
	      QO = PO.substring(len - input2, len).concat(PO.substring(0, len - input2));
	      System.out.println(PO + "		"+QO);
	      turn++;
	      text=QO;
	    }while(!QO.equalsIgnoreCase(word));

	    if (turn == 0){
	      return 0;
	    }else{
	      return turn;
	    }
	}

}
