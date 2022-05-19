package PracticeSet1;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlInlineBinaryData;


public class Student implements Comparator<Student>{

	
	private String name;
	private Long rollNum;
	private boolean isPassed;
	
	public Student(String name, Long rollNum, boolean isPassed) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.isPassed = isPassed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRollNum() {
		return rollNum;
	}

	public void setRollNum(Long rollNum) {
		this.rollNum = rollNum;
	}

	public boolean isPassed() {
		return isPassed;
	}

	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", isPassed=" + isPassed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isPassed ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rollNum == null) ? 0 : rollNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (isPassed != other.isPassed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNum == null) {
			if (other.rollNum != null)
				return false;
		} else if (!rollNum.equals(other.rollNum))
			return false;
		return true;
	}
	
	public int compare(Student o1, Student o2){
		
		return (int) (o1.getRollNum()-o2.getRollNum());
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student("Anit", 10L, true);
		Student s2 = new Student("Ritam", 20L, false);
		
		
		
		
		if(s1.compare(s1, s2)>0)
			System.out.println("True");
		else
			System.out.println("False");;
		
		
	}

	
	
}
