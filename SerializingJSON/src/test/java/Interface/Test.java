package Interface;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Secondary();
		Student s3 = new Anit();
		Student s2 = new HigherSecondary();
		System.out.println(s1.name() + "\t" + s1.address());
		System.out.println(s3.name() + "\t" + s3.address());
		System.out.println(s2.name() + "\t" + s2.address());
	}

}
