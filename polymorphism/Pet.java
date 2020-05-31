package opps.polymorphism;

public class Pet extends Animal{

	String name="Peto";   //variables don't get override
	public void walk()
	{
		System.out.println("Pet is walking");
	}
}
