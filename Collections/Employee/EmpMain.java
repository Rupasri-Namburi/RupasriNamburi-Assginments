package Employee;


import java.io.*;
import java.util.TreeSet;


class EmpMain {
	public static void main(String[] args)
    {
        // TreeSet of user defined objects
        // and using comparator also
        // we will create TreeSet of employees
        System.out.println(
            "Sorting on the basis of name in Ascending order");
 
        // passed first comparator object for
        // sorting in ascending order of name
        TreeSet<Employee> emp= new TreeSet<>(new FirstComparator());
 
        emp.add(new Employee(1, "John", 24));
        emp.add(new Employee(2, "Reena", 23));
        emp.add(new Employee(3, "Bella", 26));
        emp.add(new Employee(4, "Aelxa", 25));
 
        // printing each employee object
        for (Employee employee : emp) {
            System.out.println(employee);
        }
 
        System.out.println(
            "Sorting on the basis of name in Descending order");
 
       // Passed second comparator object for
        // Sorting in descending order of name
        TreeSet<Employee> emp2= new TreeSet<>(new SecondComparator());
        emp2.add(new Employee(1, "John", 24));
        emp2.add(new Employee(2, "Reena", 23));
        emp2.add(new Employee(3, "Bella", 26));
        emp2.add(new Employee(4, "Aelxa", 25));
 
        // printing each employee object
        for (Employee employee : emp2) {
            System.out.println(employee);
        }

 

 
        }
 
}

