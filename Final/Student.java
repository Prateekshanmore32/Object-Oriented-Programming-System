package opps.Final;

public  class Student {

	 int ROLL_NO;
	 String NAME;
	{
		NAME="Prateeksha";       //initializer blocks
	}
	public Student()
	{
		ROLL_NO=8;
	}
	public final void discription()
	{
		System.out.println("Name is "+NAME);
	}
}
