
public class StrOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		
		String s="Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println("UpperCase : "+str.toUpperCase());
		
		System.out.println("LowerCase : "+str.toLowerCase());
		
		System.out.println(str.replace("a","$"));
		
		System.out.println("Verify : "+str.contains("collection"));
		
		System.out.println("Equal or Not : "+str.equals(str));
	
		System.out.println(str == s);
	}

}
