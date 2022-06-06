package opps;

abstract class AbstractTest {
	abstract void fun();
		
}
class Derived  extends AbstractTest {
	
	public static void main(String[] args) {
		System.out.println(" ");
		
	}
	void fun() {
		
		System.out.println("Derived function called");
		
	}
}
