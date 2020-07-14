package intellect;

import java.util.Scanner;

public class seven {
	
	public static void main(String args[])
	{
		int count ,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements count:");
		count =sc.nextInt();
		int num[]=new int[count];
		System.out.println("Enter array elements:");
		for(int i=0;i<count;i++)
		{
			num[i]=sc.nextInt();
			
		}
		sc.close();
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.println("Array elements in ascending order:");
		for(int i=0;i<count-1;i++)
		{
			System.out.println(num[i]+",");
		}
		
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Array elements in decenending order:");
		for(int i=0;i<count-1;i++)
		{
			System.out.println(num[i]+",");
		}
		System.out.println(num[count - 1]);
	}
	
	
}
