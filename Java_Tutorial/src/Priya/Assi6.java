package Priya;

class Studyin
{
	void college(String name,int id)
	{
		System.out.println("College Name: "+name);
		System.out.println("College ID: "+id);
	}
	static void student(String name,int id,String address)
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student ID:"+id);
		System.out.println("Student Address:"+address);
	}
}
public class Assi6 {
public static void main(String[] args) {
	Studyin s = new Studyin();
	s.college("PRP", 563);
	Studyin.student("Priya", 03, "Vasai");
}
}
