package opps;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println(maxOf(69, 96));
		System.out.println(maxOf(66, 99, 96));
		System.out.println(maxOf(69.69f, 96.96f));
	}
	
	static int maxOf(int a,int b)
	{
		return a>b?a:b;
	}
	static int maxOf(int a,int b,int c)
	{
		return a>b?a>c?a:b:b>c?b:c;
	}
	static float maxOf(float a,float b)
	{
		return a>b?a:b;
	}

}
//96
//99
//96.96
