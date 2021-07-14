package P;

import java.util.*;

import P3.Employee;
import P3.EmployeeRepository;

public class Service {
	    public void Details() {
	        ArrayList<Emp> employees = new ArrayList<>();
	        employees.add(new Emp(1001, "Raman", 10000));
	        employees.add(new Emp(1002, "Rohit", 20000));
	        employees.add(new Emp(1003, "Manoj", 12000));
	        employees.add(new Emp(1004, "Amit", 12000));
	        employees.add(new Emp(1005, "Kabit", 11500));
	        employees.add(new Emp(1006, "Laxam", 11500));
	        employees.add(new Emp(1007, "Dipesh", 10000));
	        employees.add(new Emp(1008, "Amit", 10000));
	        employees.add(new Emp(1009, "Manoj", 17500));
	        employees.add(new Emp(1010, "Rohit", 21000));
	        employees.add(new Emp(1003, "Manoj", 15000));
	        employees.add(new Emp(1002, "Rohit", 20000));
	        for (Emp emp : employees) {
	            DataStore.eList.add(emp);
	        }
	    }

	    
	    /*"1. Print Employee List"*/
	    
	    public void showList()
	    {
	        List<Emp> emp = DataStore.eList;
	        for (Emp emp1 : emp) 
	        {
	            System.out.println(emp1);
	        }
	    }

	    /*"2. Print Employee List in Sorting Order"*/
	    
	    public void SortedEmployeeList() 
	    {
	        List<Emp> emp = DataStore.eList;
	        Collections.sort(emp);
	        for (Emp emp1 : emp)
	        {
	            System.out.println(emp1);
	        }
	    }

	    /*"3. Print all the unique Employee"*/
	    
	    public Map<Integer, Emp> UniqueDetail() {
	        List<Emp> employee = DataStore.eList;
	        Map<Integer, Emp> map = new HashMap<>();
	        for (Emp e1 : employee)
	        {
	            map.put(e1.empId, e1);
	        }
	        return map;
	    }

	    /*4. Print all the unique Employee By Sorting*/
	    
	    public void UniqueSorted() 
	    {
	        Service eService = new Service();
	        Map<Integer, Emp> map = eService.UniqueDetail();
	        List<Emp> emps = new ArrayList<>(map.values());
	        Collections.sort(emps, new NameComp());
	        for (Emp employee : emps) {
	            System.out.println(employee);
	        }
	    }

	    /*5. Print Employee details by EmpId "*/
	    
	    public void DetailByID(Integer empId)
	    {
	    	List<Emp> es =DataStore.eList;
	    	 for(Emp emp: es) 
	    	 {
	          if(emp.empId==empId)
	          {
	            
	                  System.out.println(emp.empId + " " + emp.empName + " " + emp.salary);
	              
	          }
	          
			
	    }
	    }
	       
	    

	    /*6. Print Employee List by Salary */
	    
		@SuppressWarnings("unchecked")
		public void EmployeeDetailsBySalary()
		{
	        List<Emp> empList = DataStore.eList;
	        Collections.sort(empList,new SalaryComp());
	        System.out.println("Sorted List Entries");
	        for(Emp e:empList)
	        {
	        	System.out.println(e.empId + " " + e.empName + " " + e.salary);
	        }

	          /*Map<Integer,String> map = new HashMap<>();
	          for(Emp emp: empList) 
	          {
	              map.put(emp.empId, emp.empName);

	          }
	          
			List list = new LinkedList(map.entrySet());
	          Collections.sort(list);
	        System.out.println(list);*/



	    }

	}

