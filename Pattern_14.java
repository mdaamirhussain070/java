class Pattern_14 
{
	public static void main(String[] args) 
	{
		int i,j,k,c=1;
		for(i=1;i<=3;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print(c);
				c++;
			}

			System.out.println();
		}
	}
}
