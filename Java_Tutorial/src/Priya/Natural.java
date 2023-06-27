package Priya;

import java.util.*;
public class Natural {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter no of term: ");
		
		Scanner r=new Scanner (System.in);
		n=r.nextInt();
		System.out.println(" \"Natural numbers till\" "+n);
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
