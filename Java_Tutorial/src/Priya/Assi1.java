package Priya;

class Emp
{
	String name="Priya";
	int id=03;
	int sal=6000000;
	String address="Vasai";
	
	void method()
	{
		System.out.println("`````````INFO`````````");
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee ID is: "+id);
		System.out.println("Employee Salary is: "+sal);
		System.out.println("Employee ID is: "+address);
	}
}
public class Assi1 {
public static void main(String[] args) {
	Emp e = new Emp();
	e.method();
}
}
