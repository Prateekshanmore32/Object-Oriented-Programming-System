package opps;

public class MyConstructor {

	public static void main(String[] args) {
		Vehicle car=new Vehicle(4);
		Vehicle scooty=new Vehicle(2);
		Vehicle truck =new Vehicle(6);
		System.out.println("Car "+car.wheels+" "+car.headlights+" "+car.colour);
		System.out.println("Scooty "+scooty.wheels+" "+scooty.headlights+" "+scooty.colour);
		System.out.println("Truck "+truck.wheels+" "+truck.headlights+" "+ truck.colour);
		Vehicle rikshaw=new Vehicle(3,"Yellow");
		System.out.println("Rikshaw "+rikshaw.wheels +rikshaw.headlights+" "+rikshaw.colour);
	}

}

class Vehicle
{
	int wheels,headlights;
	String colour; 
	Vehicle() {
		
	} 
	Vehicle(int wheels)
	 {
		 this.wheels=wheels;
		 headlights=2;
	 }
	Vehicle(int wheels,String colour)
	{
		this.wheels=wheels;
		this.colour=colour;
	}
}
//Car 4 2 null
//Scooty 2 2 null
//Truck 6 2 null
//Rikshaw 30 Yellow

