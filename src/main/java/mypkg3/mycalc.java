package mypkg3;

public class mycalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     mycalc calc = new mycalc();
     System.out.println("sum is : "+ calc.sum(20,10));
     System.out.println("diff is : "+ calc.diff(20,10));
     System.out.println("mul is : "+ calc.mul(20, 10)); 
	}

}
