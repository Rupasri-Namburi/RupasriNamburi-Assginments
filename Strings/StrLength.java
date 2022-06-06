import java.util.Scanner;

public class StrLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter String : ");
        
        String str = scan.nextLine();
        System.out.print("String Length : "+str.length());
        
        scan.close();
	}

}
