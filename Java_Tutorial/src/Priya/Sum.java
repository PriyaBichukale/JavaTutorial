package Priya;

import java.util.*;
public class Sum {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter no of terms:");
		Scanner t =new Scanner (System.in);
		n=t.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Addition:"+sum);
		
	}
}
