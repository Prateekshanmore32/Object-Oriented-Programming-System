package opps.packages.models;

public class Teacher {
	private String name;
	public Teacher(String name)
	{
		this.name=name;
	}
	public String getTeacherName()
	{
		return name;
	}
	public static void main(String []args)
	{
		Student s1=new Student("Neha");
		s1.getPassword();
	}
}
