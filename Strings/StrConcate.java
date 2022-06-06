import java.util.Scanner;

public class StrConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String str1 = scan.nextLine();
        
        
        System.out.print("Enter String2 : ");
        String str2 = scan.nextLine();
        System.out.println(str1+" "+str2);
        
        String str = String.join("  ", str1,str2 );
        System.out.println("String join Method : "+str);
        
        String str3 = str1.concat(str2);
        System.out.println("String concat Method : "+str3 );
        scan.close();

	}

}
