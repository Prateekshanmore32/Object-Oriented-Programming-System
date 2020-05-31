package opps.abstraction;

public class RepairShop {

	public static void repair(Car car,String s)
	{
		System.out.println("Your car "+s +" is repaired");
	}
	public static void main(String[] args) {

		WagonR car1=new WagonR();
		Audi car2=new Audi();
		repair(car1,car1.name);
		repair(car2,car2.name);
	}

}

//Your car WagonR is repaired
//Your car Audi is repaired
