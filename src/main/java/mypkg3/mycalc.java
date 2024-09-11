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
	public int div(int a, int b)
	{
		return a/b;
	}
	public int remainder(int a, int b)
	{
		return a%b;
	}
    public void show()
    {
    	System.out.println("GFG Show Function!!");
    }
    public void hello()
    {
    	System.out.println("GFG Hello Function!!");
    }
    public void test()
    {
    	System.out.println("Hello! Docker Container from Github Actions");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     mycalc calc = new mycalc();
     System.out.println("sum is : "+ calc.sum(20,10));
     System.out.println("diff is : "+ calc.diff(20,10));
     System.out.println("mul is : "+ calc.mul(20, 10)); 
     System.out.println("div is : "+ calc.div(20, 10));
     System.out.println("rem is : "+ calc.remainder(20, 10));
     System.out.println("div is : "+ calc.div(30, 10));
	 calc.show();
	 System.out.println("sum is : "+ calc.sum(120, 10));
	 System.out.println("diff is : "+ calc.diff(10, 10));
	 calc.hello();
	 calc.test();
}
