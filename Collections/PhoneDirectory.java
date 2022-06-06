
public class PhoneDirectory {
	public static void main(String[] args) {
		PhoneDirectory directory = new PhoneDirectory();
		System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
		System.out.println("adds several entries.  It then prints the contents of");
		System.out.println("directory and does a few lookups.");
		System.out.println();
		directory.putNumber("Raj","555-1234");
		directory.putNumber("John","555-2345");
		directory.putNumber("Alex","555-3456");
		System.out.println("Contents are:");
		System.out.println();
		directory.print();
		System.out.println();
		System.out.println("Number for Raj is " + directory.getNumber("Raj"));
		System.out.println("Number for John is " + directory.getNumber("John"));
		System.out.println("Number for Alex is " + directory.getNumber("Alex"));
		
	}

	private String getNumber(String string) {
		
		return null;
	}

	private void print() {
		

	}

	private void putNumber(String string, String string2) {
		

	}

}
