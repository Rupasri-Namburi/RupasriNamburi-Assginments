import java.util.Scanner;

interface Arthematic{
	int operations(int a,int b);
}
public class LbdArithOperations {
	public static void main(String args[])
	{

		Arthematic add=(int a,int b) -> (a+b);
		System.out.println("Addition : "+add.operations(55, 45));
		
		Arthematic sub=(int a,int b) -> (a-b);
		System.out.println("Subtraction : "+sub.operations(55, 45));
		
		Arthematic mul=(int a,int b) -> (a*b);
		System.out.println("Multiplication : "+mul.operations(5, 4));
		
		Arthematic div=(int a,int b) -> (a*b);
		System.out.println("Division : "+div.operations(5, 4));
	}

}
