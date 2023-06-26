package Priya;
import java.util.*;
public class Even {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter no of terms: ");
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		System.out.println("\"Even no between 1 to "+n+"\" ");
		for(int i=2;i<=n;i=i+2)
		{
			System.out.println(i);
		}
	}
}
