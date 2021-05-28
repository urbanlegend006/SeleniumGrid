package MockTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Parent{
	public int startElement;
	public int endElement;
	
	public String filter() {
		
		return null;
	}
}

class ChildOne extends Parent{
	
	public String filter(int startElement, int endElement) {

		String primeString = "";
		
		for (int i = startElement; i <= endElement; i++) {
			boolean prime = true;
			if(i==0 || i == 2) {
				primeString+="";
			}
			else {
				for(int j = 2; j<i; j++) {
					if(i%j==0) {
						prime = false;
						break;
					}
				}
			}
			
			if (prime == true) {
				primeString += i+" ";
			}
			
			
		}

		return primeString.trim();
	}
}

class ChildTwo extends Parent{
	int flag = 1;
	public String filter(int startElement, int endElement) {
		String happy="";
		
		for (int i = startElement; i <= endElement; i++) {
			this.happyDig(i);
			if (flag==1) {
				happy+=i+" ";
			}
		}
		
		return happy.trim();
	}	
	
	public void happyDig(int j) {
		this.flag = 1;
		int sum = 0;
		while(j!=0) {
			sum+= Math.pow(j%10, 2);
			j /= 10;
		}
		if (sum!=1) {
			if(sum == 4) {
				this.flag = 0;
			}else {
				j = sum;
				this.happyDig(j);
			}
		}
	}
}

public class Solution {
    public static void main(String[] args)  {
        
    	 int firstNum = 0, secondNum = 0, result;
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    try {
    	       firstNum = Integer.parseInt(br.readLine());
    	       secondNum = Integer.parseInt(br.readLine());
    	    } catch (IOException ioe) {
    	       System.out.println(ioe);
    	    }
    	    
    	    ChildOne c1 = new ChildOne();
    	    System.out.println(c1.filter(firstNum, secondNum));
    	    ChildTwo c2 = new ChildTwo();
    	    System.out.println(c2.filter(firstNum, secondNum));
    	    
        
    }
    
   
    
}

