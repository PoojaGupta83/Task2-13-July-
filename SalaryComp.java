package P;
import java.util.Comparator;

public class SalaryComp implements Comparator<Emp> 
{
    @Override
    public int compare(Emp e1, Emp e2)
	{
		{

if(e1.salary>e2.salary)
{
	return 1;
}
else
{
	return -1;
}
}
}
        
}
