class Pattern_18
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		} 

//	System.out.println();
			for(i=1;i<=5;i++)
			{
				for(j=1;j<=11;j++)
				{
					if((i==3 && j==5 )|| (i==3 && j==6) || (i==3 && j==7) || (i==4 && j==5) ||(i==4 && j==6) ||(i==4 &&j==7) ||(i==5 && j==5) || (i==5 && j==6) || (i==5 && j==7))
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
		
	}
}
