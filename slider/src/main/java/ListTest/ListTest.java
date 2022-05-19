package ListTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		if(list.size()>0)
			System.out.println(list.get(0));
	}

}
