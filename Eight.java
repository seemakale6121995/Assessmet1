package intellect;

public class Eight {
	
	public static void main(String args[])
	{
		int [] Array= {5,8,3,7};
		int element =3;
		int index = 0;
		
		for(int i=0;i<Array.length;i++)
		{
			if(element==Array[i])
			{
				index=i;
			}
		}
		
		System.out.println("Location of the elemnt" +index);
	}

}
