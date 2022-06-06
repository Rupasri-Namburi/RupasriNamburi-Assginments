package ExceptionHandling;

import java.io.*;  
import java.util.Scanner;
@SuppressWarnings("unused")
class Login{
    int ac_number = 123456789;
    int ac_pass = 112223;
    int ac, pw;
    public void acceptInput(){
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ABC Bank Account Number: ");
        ac = scanner.nextInt();
        System.out.print("Enter Password: ");
        pw = scanner.nextInt();
    }
    public void verify() throws Exception{
         
        if(ac == ac_number && pw == ac_pass)
        {
            System.out.println("Your ABC Bank Account Login Successfully !");
            BankingAccount b = new BankingAccount();
            System.out.println(" ");
            System.out.println("Your Account Balance is: "+b.getBalance()+" Rupees");
            System.out.println(" ");
            Menu m1 = new Menu();
            m1.showMenu();
        }else{
            InvalidTransaction loginfailed = new InvalidTransaction("Incorrect Login Credentials !");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }
}
