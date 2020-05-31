/*
 * Java is pas by value only. here address is passed in case of non-primitive
 * data type. So when swap is performed on objects only reference is swapped
 * but when we change the value the initial values also gets changed because 
 * it is pointing to the reference.
 */
package opps;

public class PassByValue {

	public static void main(String[] args) {

			int c=5;
			int d=8;
			swap(c,d);
			System.out.println(c+" "+d);
			Pen p1=new Pen();
			p1.rs=10;
			Pen p2=new Pen();
			p2.rs=20;
			swap2(p1,p2);
			System.out.println(p1.rs+" "+p2.rs);
			change(p1);
			System.out.println(p1.rs);
	}
	static void swap(int a,int b)   //Primitive data type->"Pass By Value"
	{
		int temp=a;
		a=b;
		b=temp;
	}
	static void swap2(Pen p1,Pen p2) //Non-prim->pass by value(Adress/reference is passed)
	{
		Pen temp=p1;
		p1=p2;
		p2=temp;
	}
	static void change (Pen p)
	{
		p.rs=30;
	}
}

class Pen
{
	int rs;
}

//5 8
//10 20
//30
