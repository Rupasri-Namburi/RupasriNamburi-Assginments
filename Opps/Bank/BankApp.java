package opps;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings svg=new Savings(1,20000);
		svg.amount();
		Current cur = new Current(2,2000);
		cur.amount();
		cur.total(20000,2000);

	}

}
