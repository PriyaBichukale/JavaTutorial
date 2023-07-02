package Priya;

abstract class Abstract2
{
	static void method1(int a)
	{
	System.out.println(a);
	}
	void method2(int b)
	{
	System.out.println(b);	
	}
	abstract void method3(int a,int b);
	
}
class Abstract3 extends Abstract2
{
	void method3(int a,int b)
	{
		System.out.println(a+b);
	}
}
public class Abstract {
public static void main(String[] args) 
{
	Abstract3 a = new Abstract3();
	Abstract3.method1(10);
	a.method2(20);
	a.method3(10, 20);
}
}
