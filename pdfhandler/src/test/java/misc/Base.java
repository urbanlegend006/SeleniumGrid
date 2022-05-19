package misc;

public class Base {
	
	
	public final void doSomething(Object o) {
		System.out.println("Object");	
	}
	
	class Derived extends Base {
		
		public void doSomething(String s) {
			System.out.println("String");
		}
	}
	
	
	public static void main(String[] args) {
		Base b = new Base();
		Base d = new Base().new Derived();
		b.doSomething(new String("anit"));
		d.doSomething(new String("anit"));
	}

}


