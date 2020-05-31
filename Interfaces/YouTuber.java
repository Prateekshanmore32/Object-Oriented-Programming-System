package opps.Interfaces;

public  interface YouTuber extends VideoEditor {
	public  void makingVideo();
	default void discp()
	{
		System.out.println("hi there");
	}
}
