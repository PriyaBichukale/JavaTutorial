package Priya;

class Classes
{
	static String name,name2;
	String batch1,batch2;
	static int sal,sal2;
	static void staff1(String n,int s)
	{
		n=name;
		s=sal;
		System.out.println(name);
	}
	static void staff2(String n2,int s2)
	{
		n2=name2;
		s2=sal2;
	}
	
	void batches(String b1,String b2)
	{
		b1=batch1;
		b2=batch2;
	}
}
class Classes2 extends Classes
{
	void InfoBatch1()
	{
		System.out.println("```````1st Batch Info```````");
		System.out.println("1st Batch Name is:"+batch1);
		System.out.println("Teacher name is :"+name);
		System.out.println("Teacher salary is :"+sal);
	}
	void InfoBatch2()
	{
		System.out.println("```````2nd Batch Info```````");
		System.out.println("2nd Batch Name is:"+batch2);
		System.out.println("Teacher name is :"+name2);
		System.out.println("Teacher salary is :"+sal2);
	}
}
public class Assi2 {
	public static void main(String[] args) {
		Classes2 c = new Classes2();
		Classes2.staff1("Suhani", 50000);
		Classes2.staff2("Janavi", 40000);
		c.batches("Computer Science", "Civil");
		c.InfoBatch1();
		c.InfoBatch2();
	}
}
