package opps.encapsulations;

public class Encapsulations {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setAge(25);
		s1.setName("Prateeksha");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		
		Student s2=new Student();
		s2.setAge(18);
		s2.setName("Prachi");
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
	}

}
//You are too odd
//0
//Prateeksha
//18
//Prachi
