package Employee;

import java.util.Comparator;

class FirstComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        return (e1.name).compareTo(e2.name);
    }
}


class SecondComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        return -(e1.name).compareTo(e2.name);
    }
}

