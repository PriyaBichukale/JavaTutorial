package Priya;
import java.util.*;
public class EvenOddRange {
	public static void main(String[] args) {
		int n,i,sum=0;
		System.out.println("Enter range: ");
		Scanner s= new Scanner (System.in);
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Even no between 0 to "+n+" ");
			for( i=0;i<=n;i=i+2)
			{
				System.out.println(i);
				sum=sum+i;
			}
			System.out.println("Sum of all even nos: "+sum);
		}
		else
		{
			System.out.println("Odd no between 0 to "+n+" ");

			for( i=1;i<=n;i=i+2)
			{
				System.out.println(i);
				sum=sum+i;
				
			}
			System.out.println("Sum of all odd nos: "+sum);
			}
	}

}
