package Priya;

abstract class Office
{
	static void Employee(String name,int id,String add,String gender)
	{
		System.out.println("`````````Employee Info``````````");
		System.out.println("Employee Name:"+name);
		System.out.println("Employee ID:"+id);
		System.out.println("Employee Address:"+add);
		System.out.println("Employee Gender:"+gender);
		System.out.println();
	}
	abstract void Department(String name,int no,String location);
}
class Company extends Office
{
	public void Department(String name,int no,String location)
	{
		System.out.println("`````````Department Info`````````");
		System.out.println("Department name:"+name);
		System.out.println("Department no:"+no);
		System.out.println("Department location:"+location);
		System.out.println();
	}
}
interface Office2
{
	void Project(int no,String name,String loc);
	void Dependent(String name,String gen,String relation);
}
class Company2 implements Office2
{
	public void Project(int no,String name,String loc)
	{
		System.out.println("``````Project Info``````");
		System.out.println("Project no:"+no);
		System.out.println("Project Name:"+name);
		System.out.println("Project Location:"+loc);
		System.out.println();
	}
	public void Dependent(String name,String gen,String relation)
	{
		System.out.println("``````Deendent Info```````");
		System.out.println("Dependent name:"+name);
		System.out.println("Dependent Gender:"+gen);
		System.out.println("Dependent Relation:"+relation);
		System.out.println();
	}
}
public class Assi5 {
	public static void main(String[] args) {
		Company c = new Company();
		c.Department("COMPUTER",67, "Mira Road");
		Company.Employee("Suhani", 89, "Mira Road", "Female");
		Company2 o = new Company2();
		o.Project(5, "App Development", "Mira Road");
		o.Dependent("Raj", "Male", "Costomer");
	}
}
