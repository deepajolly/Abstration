package assignment;

public class Contractor extends Employee{
	static int time=8;
	public static void main(String args[])
	{
		Contractor ob=new Contractor();
		ob.calculateSalary(500,200,100);
	}
public void calculateSalary(int basic, int bonus,int deduct)
{
	float hra=(basic*5)/100;
	int pf=(basic*20)/100;
	float totalsalary=basic+hra+bonus-deduct-pf;
	
	float totalpay=totalsalary*time;
	System.out.println("Amount to be paid "+totalpay);
}
}
