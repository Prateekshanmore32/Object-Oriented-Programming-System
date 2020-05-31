package opps.Static;

public class StaticBlocks {

	static {
		System.out.println("In block 1");
	}
	static {
		System.out.println("In block 2");
	}
	public static void main(String[] args) {

		System.out.println("In main block");
	}
	
	static {
		System.out.println("In block 3");
	}
}
//In block 1
//In block 2
//In block 3
//In main block
