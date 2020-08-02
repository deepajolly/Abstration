package example2;

public class Const2 extends Const1 {
	public static void main(String args[])
	{
		Const1 ob=new Const2();
		ob.print();
	}
	public void print()
	{
		System.out.println("Abstract method");
	}
}
