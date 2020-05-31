package opps.Interfaces;

public class Person implements Student,YouTuber  {

	public static void main(String[] args) {

		Person p=new Person();
		p.discp();

	}
	public void studying()
	{
		System.out.println("Person is studying");
	}
	public void makingVideo()
	{
		System.out.println("Person is making videos");
	}
	public void editVideo()
	{
		System.out.println("Editing the video");
	}

}
//Person is studying
//Person is making videos
