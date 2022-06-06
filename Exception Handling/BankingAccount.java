package ExceptionHandling;

import java.util.Scanner;
@SuppressWarnings("unused")
class BankingAccount{
    int amount = 5000;
	private Exception illegalWithDraw;
	private Object IllegalTransaction;
	private Object InvalidTransaction;
    public void initiate()
    {
        Login l1 = new Login();
        try{
            l1.acceptInput();
            l1.verify();
            
        }catch(Exception e)
        {
            try{
                l1.acceptInput();
                l1.verify();
                
            }catch(Exception f)
            {
               
             }
        }
    }
    public int getBalance(){
        return amount;
    }
    public void add(int amt){
        amount = amount + amt;
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +amount);
        System.out.println(" ");
    }
    public void withdraw(int amt){
        System.out.println(" ");
        if(amount < amt)
        {
            InvalidTransaction invalidWithDraw = new InvalidTransaction("Insufficient Balance");
            System.out.println(invalidWithDraw.getMessage());
        }else{
        	if(amt>0) {
        		amount = (amount - amt);
        		System.out.println("Please Collect your " + amt +" Rupees");
        		System.out.println(" ");
        		System.out.println("Available Balance: " +amount);
        		System.out.println(" ");
        	}
        	else
        	{
        		InvalidTransaction illegalWithDraw = new InvalidTransaction("Invalid Withdrawal Amount");
        		System.out.println(illegalWithDraw.getMessage());
        	}
      
        }
    }
	
}
