package Priya;

class Mother
{
	String name="Daivata";
	void MotherFirstName()
	{
		System.out.println("Mother First Name is:"+name);
	}
	void LastName(String last)
	{
		System.out.println("Mother Last Name is: "+last);
		System.out.println("```````Mother Full Name``````");
		System.out.println("Mother Full Name is: "+name+" "+last);
	}

}
class Father
{
	String name="Laxman";
	void FatherFirstName()
	{
		System.out.println("Father First Name is: "+name);
	}
	void LastName(String last)
	{
		System.out.println("Father last name is: "+last);
		System.out.println("```````Father Full Name``````");
		System.out.println("Father Full Name is: "+name+" "+last);
	}
}

public class Assi3 {
public static void main(String[] args) {
	Mother m = new Mother();
		m.MotherFirstName();
	    m.LastName("Bichukale");
	Father f = new Father();
		f.FatherFirstName();
		f.LastName("Bichukale");
}
}
