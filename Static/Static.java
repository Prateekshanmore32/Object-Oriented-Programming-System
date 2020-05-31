package opps.Static;
import opps.Static.A.B;
import opps.Static.A.C;;
public class Static {

	static int age=18;
		public static void main(String args[])
		{
			
			Person p1=new Person();
			p1.setAge(18);
			System.out.println(p1.getAge());
			p1.setName("Prateeksha");
			System.out.println(p1.getName());
			System.out.println(p1.getBreed());
			
			
			A objA=new A();
			B objB=objA.new B();
			C objC=new A.C();
			
		}
}
//18
//Prateeksha
//Homo Sapeins
