package opps.packages;
import opps.packages.models.*;
public class MainClass {

	public static void main(String[] args) {
		
		Student s1=new Student("Prateeksha");
		Teacher t1=new Teacher("Sangita");
		System.out.println(s1.getStudentName());
		System.out.println(t1.getTeacherName());
		
	}

}
