package opps;

import java.util.Scanner;

public class BankAccount {
	int account_type;
	private Scanner sc=new Scanner(System.in);
	public BankAccount(int account_type) {
		System.out.println("Enter Account type 1.Savings 2.Current :");
		account_type=sc.nextInt();
	}
}
class Savings extends BankAccount{
	int fixedDeposits;
	public Savings(int account_type,int fixedDeposits) {
		super(account_type);
		this.fixedDeposits=fixedDeposits;
	}
	public void amount() {
		System.out.println("Fixed Amount : "+fixedDeposits);
	}  
	
}
class Current extends BankAccount{
	int cashcredit;
	public Current(int account_type,int cashcredit) {
		super(account_type);
		this.cashcredit=cashcredit;
	}
	public void amount() {
		System.out.println("Fixed Amount : "+cashcredit);
	}  
	void total(int fixedDeposits,int cashcredit) {
		int total=fixedDeposits+cashcredit;
		System.out.println("Total amount : "+total);
	} 
}
