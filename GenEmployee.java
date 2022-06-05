import java.util.*;
public class GenEmployee {
	private int empId;
	private String empName;
	private int salary;
	private String department;
	
	public GenEmployee(int empId,String empName,int salary,String department) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.department=department;
	}
	
	public final int getEmpId() 
	{
		return empId;
	}
	
	public final void setEmpId(int empId) 
	{
		this.empId=empId;
	}
	
	public final String getEmpName()
	{
		return empName;
	}
	
	public final void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public final int getsalary() {
		return salary;
	}
	
	public final void setsalary(int salary) {
		this.salary=salary;
	}
	public final String getdepartment() {
		return department;
	}
	public final void setdepartment(String department) {
		this.department=department;
	}
	public String toString() {
		return "Employee [empId = "+empId+", empName = "+empName+", salary = "+salary+", department = "+department+" ]";
	}
	public int hashCode() {
		return this.empId;
	}
	public boolean equals(Object obj) {
		GenEmployee employee=(GenEmployee) obj;
		if(employee.empId == this.empId) {
			employee.setEmpName(this.empName);
			employee.setsalary(this.salary);
			employee.setdepartment(this.department);
		}
		return true;
	}

	public static void main(String[] args) {
		Set<GenEmployee> employees =new HashSet<>();
		employees.add(new GenEmployee(1,"Rupasri",50000,"IT"));
		employees.add(new GenEmployee(1,"sri",50000,"cse"));
		employees.add(new GenEmployee(1,"Raja",50000,"IT"));
		employees.add(new GenEmployee(1,"varma",50000,"cse"));
		
		System.out.println(employees);

	}
	

}
