package P;

import java.util.*;

import P.Service;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     
       
     
       
         
    System.out.println("Employee Details");
   	System.out.println("1. Print Employee List");
   	System.out.println("2. Print Employee List in Sorting Order");
   	System.out.println("3. Print all the unique Employee"); 
   	System.out.println("4. Print all the unique Employee By Sorting"); 
   	System.out.println("5. Print Employee details by EmpId ");
   	System.out.println("6. Print Employee List by Salary ");
   	System.out.println("7. Exit");
       

         Service b1 = new Service();
         System.out.println("Enter the option");
        
        	 int option=sc.nextInt();
        	  b1.Details();
            
            if(option == 1)
            {
                b1.showList();
            }
            else if( option == 2)
            {
                b1.SortedEmployeeList();
            }
            else if( option == 3)
            {
                System.out.println(b1.UniqueDetail());
            }
            else if( option == 4)
            {
                b1.UniqueSorted();
         }
            else if( option == 5)
            {
                System.out.println("Enter employee id");
                Integer o = sc.nextInt();
                b1.DetailByID(o);
                
            }
            else if( option == 6)
            {
                b1.EmployeeDetailsBySalary();
            }
            else if( option == 7)
            {
                System.out.println("Exit");
              
            
            }
            else
            {
                System.out.println("Option not available");
            }
        }
    }
       
    