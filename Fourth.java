package intellect;

public class Fourth {
	
	public static void main(String args[])
	{
		
		int num=29;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println(num+"number is prime");
		}
		else
		{
			System.out.println(num+"number is  not prime");
		}
		
	}

}
