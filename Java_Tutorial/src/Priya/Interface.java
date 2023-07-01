package Priya;

interface Interface2
{
	static int a=10;
	final int b=20;
	public int c=30;
	
	void method1();
}
class Interface3 implements Interface2
{
	public void method1()
	{
		System.out.println(a+b+c);
	}
}
public class Interface {
public static void main(String[] args) 
{
	Interface3 i = new Interface3();
	i.method1();
}
}
