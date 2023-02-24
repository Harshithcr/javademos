package sample;

public class javastatic {
	private javastatic() {
		System.out.println("Inside constructor");
	}
	
	static {
		System.out.println("static claa");
	}
	{
		System.out.println("non static class");
	}
	public static void main(String[] args)
	{
		System.out.println("Inside main block");
		javastatic js=new javastatic();
	
		
	}

}
