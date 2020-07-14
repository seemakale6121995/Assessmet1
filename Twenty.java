package intellect;

public class Twenty {
	public static void maxelement(int no_OF_rows,int[][] arr)
	{
		int i=0;
		int max=0;
		int[]result = new int[no_OF_rows];
		while(i<no_OF_rows)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
			result[i]=max;
			max=0;
			i++;
		}
		printArray(result);
	}
	
	private static void printArray(int[] result)
	{
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	
	public static void main(String args[])
	{
		int[][] arr=new int[][]
				{
			{3,4,1,8},
			{1,4,9,11},
			{76,34,21,1},
			{2,1,4,5}};
			
			maxelement(4,arr);
				}
	
		
	
	
	
	}


