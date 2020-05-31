/*
 * In static methods we cannot call non-static methods
 */
package opps;

public class MethodsIntroduction {

	public static void main(String[] args) {
			
		int res1=maxOfTwoNum(35, 69);
		System.out.println(res1);
		int res2=maxOfThreeNum(10, 20, 30);
		System.out.println(res2);
	}
	static int maxOfTwoNum(int a,int b)
	{
		return a>b?a:b;
	}
	static int maxOfThreeNum(int a,int b,int c)
	{
		return a>b?a>c?a:c:b>c?b:c;
	}

}
