package MockTest;

public class Result{
	public static void main(String[] args) {
		int[][] students_marks1 = {
				{55,63,77,82,91},
				{10,20,30,40}
		};
		Result1 rs1 = new Result1();
		
		String[] ss = rs1.calculateGrade(students_marks1);
		System.out.println(ss.length);
	}
	
}

class Result1 {

    /*
     * Complete the 'calculateGrade' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY students_marks as parameter.
     */

    public String[] calculateGrade(int[][] students_marks) {
        
        int stdCount = 0;
        int subCount = 0;
        float average = 0;
        String[] result = new String[students_marks.length];
        
		/*
		 * for (int i = 0; i< stdCount; i++) { int total_score = 0 ; subCount =
		 * students_marks[i].length; for(int j = 0; j< subCount; j++) { total_score +=
		 * students_marks[i][j]; }
		 * 
		 * average = total_score/subCount;
		 * 
		 * if (average >= 90) { result[i] = "A+"; continue; } else if (80<=average &&
		 * average<90) { result[i] = "A"; continue; } else if (80<=average &&
		 * average<90) { result[i] = "A"; continue; } else if (70<=average &&
		 * average<80) { result[i] = "B"; continue; } else if (60<=average &&
		 * average<70) { result[i] = "C"; continue; } else if (50<=average &&
		 * average<60) { result[i] = "D"; continue; } else { result[i] = "F"; continue;
		 * } }
		 */
        
        for (int[] std : students_marks) {
        	
        	int total_score = 0 ;
        	for (int sub : std) {
				total_score+=sub;
			}
        	average = (float)total_score/std.length;
        	
			if (average >= 90) {
				result[stdCount] = "A+";
				
			} else if (80 <= average && average < 90) {
				result[stdCount] = "A";
				
			} else if (80 <= average && average < 90) {
				result[stdCount] = "A";
				
			} else if (70 <= average && average < 80) {
				result[stdCount] = "B";
				
			} else if (60 <= average && average < 70) {
				result[stdCount] = "C";
				
			} else if (50 <= average && average < 60) {
				result[stdCount] = "D";
				
			} else {
				result[stdCount] = "F";
				
			}
        	stdCount+=1;
        	
        	}
        
        return result;
    }
}
   

