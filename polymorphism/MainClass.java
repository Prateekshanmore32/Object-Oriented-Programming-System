package opps.polymorphism;

public class MainClass {

	public static void main(String[] args) {

			Dog d=new Dog();
			Pet p=d;
			d.walk();
			p.walk();
			System.out.println(d.name);
			System.out.println(p.name);
			greetings();
			greetings("good eve!");

	}

	public static void greetings()
	{
		System.out.println("hi");
		
	}
	public static void greetings(String s)
	{
		System.out.println(s);
	}
}
