/*
 * Class is just an logical entity. But object of a class occupy some 
 * space in the memory. Object stores the address.
 * 
 */
package opps;

class Dog
{
	String name;
	String breed;
	public void discription()
	{
		System.out.println("my dog name is "+name+" and its breed is "+breed);
	}
	public void walking()
	{
		System.out.println("my dog "+name+" is walking");
	}
}
public class ObjectsAndClasses {

	public static void main(String[] args) {

		Dog d1=new Dog();
		Dog d2=new Dog();
		d1.name="Goldy";
		d1.breed="Husky";
		d2.name="Sonu";
		d2.breed="Poodle";
		d1.discription();
		d1.walking();
		d2.discription();
		d2.walking();
	}

}
