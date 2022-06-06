package opps;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager=new Manager("Manager","Rupasri",1,200000,100000);
		manager.manager_data();
		manager.totalSalary();
		
		Labour labour=new Labour("Labour","sri",2,100000,50000);
		labour.Labour_data();
		labour.totalSalary();
		

	}

}
