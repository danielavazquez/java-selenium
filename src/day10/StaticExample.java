package day10;

public class StaticExample {
	
	
	
	static int a=10; //static
	int b=20; //non-static
	
	static void m1() 
	{
		System.out.println("this is a m1 static method");
	}
	
	void m2() 
	{
		System.out.println("this is an m2 non-static method");
	}	
	
	
	//Can access everything, non-static METHOD, no restrictions, can access everything directly
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}	
	
	



}
