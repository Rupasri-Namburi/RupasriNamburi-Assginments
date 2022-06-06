package ExceptionHandling;

import java.util.Scanner;
class Deposit{
    int amt= 0;
    
    public int userInput()
    {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
        if(amt<=0)
        {
            InvalidTransaction depositnegativeError = new InvalidTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }else{   
            return amt;
        }
        return amt;
        
    }
}