class Pattern_8 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==4 || j==0 || j==4 || i==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

				System.out.println();
		}

	}
}
