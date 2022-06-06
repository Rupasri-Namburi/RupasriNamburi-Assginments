package opps;

public class Employee {
	String Designation;
	String name;
	int id;
	long salary;
	public Employee(String Designation,String name,int id,long salary){
		this.Designation=Designation;
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
}
class Manager extends Employee{
	int incentive;
	public Manager(String Designation,String name,int id,long salary,int incentive) {
		super(Designation,name,id,salary);
		this.incentive=incentive;
	}
	public void manager_data() {
		System.out.println("Employee Desination : "+Designation);
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee salary : "+salary);
		System.out.println("Employee incentive : "+incentive);
	}
	void totalSalary() {
		long total;
		total=salary+incentive;
		System.out.println("Total Salary : "+total);
	}
}
class Labour extends Employee
{
	int overtime;
	public Labour(String Designation,String name,int id,long salary,int overtime) {
		super(Designation,name,id,salary);
		this.overtime=overtime;
	}
	public void Labour_data() {
		System.out.println("Employee Desination : "+Designation);
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee salary : "+salary);
		System.out.println("Employee overtime : "+overtime);
	}
	void totalSalary() {
		long total;
		total=salary+overtime;
		System.out.println("Total Salary : "+total);
	}
}