package ExceptionHandling;

import java.util.*;

public class ArthExceptionUnsupport {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);

		// input numbers here.
		System.out.print("Enter first number : ");
		a=sc.nextInt();

		System.out.print("Enter second number : ");
		b=sc.nextInt();
		double c=a/b;
		System.out.println("Result:"+c);
		
		
		List aList = new ArrayList();
		aList.add('1');
		aList.add('2');
		List newList = Collections.unmodifiableList(aList);
		newList.add('3');
		
		sc.close();
	}
}