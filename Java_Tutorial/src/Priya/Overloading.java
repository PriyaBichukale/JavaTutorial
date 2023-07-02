package Priya;
//Overloading example
class Class1{
	void method1(int a,int b)
	{
		System.out.println(a+b);
	}
	void method1(int a)
	{
		System.out.println(a);
	}
}

public class Overloading {
	
	public static void main(String[] args) {
		Class1 c= new Class1();
		c.method1(10);
		c.method1(20, 30);
	}

}
