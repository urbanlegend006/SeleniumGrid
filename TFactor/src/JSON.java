
public class JSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(levelCount();
	}

	private static int levelCount(String word) {
		// TODO Auto-generated method stub
		 int oB = 0 ;
		    int cB = 0;
		    char charArray [] = word.toCharArray();
		      for (int i=0; i<word.length(); i++){
		        if(charArray[i]=='{'){
		          oB++;
		        }else if(charArray[i]=='}'){
		          cB++;
		        }
		      }

		      if(oB==cB){
		        return oB;
		      }
			return 0;
	}

}
