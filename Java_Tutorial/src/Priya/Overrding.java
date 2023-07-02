package Priya;

class Overriding2
{
	void method1(int a)
	{
		System.out.println(a);
	}
}
class Overriding3 extends Overriding2
{
	void method1(int a)
	{
		System.out.println(a);
	}
}
public class Overrding {
public static void main(String[] args) {
	Overriding2 v = new Overriding2();
	Overriding3 o = new Overriding3();
	o.method1(10);
	v.method1(20);
	
}
}
