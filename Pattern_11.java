class Pattern_11 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(11-2*i);k++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
