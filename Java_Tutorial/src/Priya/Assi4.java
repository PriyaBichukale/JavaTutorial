package Priya;

class Videocall
{
	
}
class Conferencecall
{
	
}
class Voicecall 
{
	
	
}
class Mobile
{
	void call(Voicecall v)
	{
		System.out.println("I support Voice Call");
	}
	void call(Conferencecall c)
	{
		System.out.println("I support Conference Call");
	}
	void call(Videocall vi)
	{
		System.out.println("I support VideoCall");
	}
}
public class Assi4 {
public static void main(String[] args) {
		Mobile oopo = new Mobile();
		oopo.call(new Voicecall());
		oopo.call(new Videocall());
		oopo.call(new Conferencecall());
}
}
