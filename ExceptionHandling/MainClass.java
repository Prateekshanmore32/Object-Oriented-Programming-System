package opps.ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
//			try
//			{
//			int a=5;
//			int b=0;
//			int c=a/b;
//			System.out.println(c);
//			}catch(ArithmeticException e)
//			{
//				System.out.println(e.getMessage());
//			}
//			System.out.println("very imp code ");
		
		try {
			fun1();
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("very imp code. need to be run");
		fun4();
	}
	static void fun1()
	{
		fun2();
	}
	static void fun2()
	{
		fun3();
	}
	static void fun3()
	{
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);
		boolean danger=true;
		if(danger) {
			throw new ArithmeticException("Exception occured");
		}
	}
	static void fun4() {
		try
		{
			fun5();
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" occured");
		}
	}
	static void fun5()throws ArithmeticException {
		throw new ArithmeticException("Arithmetic Exception");
	}
}
