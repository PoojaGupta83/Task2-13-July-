package P;
import java.util.*;

public class Emp implements Comparable<Emp> 
{
    public int empId;
    public String empName;
    public int salary;


    public Emp(int empId, String empName, int salary)
{
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }


    @Override
    public String toString()
    {
        return
                "{"+  empId +","+
                 empName  +","+ salary+"}" ;
    }

    @Override
    public boolean equals(Object o) {
        if (o==this) 
        	return true;
        if (o == null )
			return false;
        Emp employee = (Emp) o;
        return Objects.equals(empId,employee.empId )&& Objects.equals(salary,employee.salary)  && Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(empId, empName, salary);
    }

    public int compareTo(Emp emp) 
    {
        return this.empId - emp.empId;
    }
	public static void main(String args[])
	{
		System.out.println("Abc");
	}
}