package P;
import java.util.Comparator;

import P.Emp;

public class NameComp implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) 
	{
		
        return e1.empName.compareTo(e2.empName);
    }

	
}
