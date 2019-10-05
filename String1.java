class String1
{
	public static void main(String[] args) 
	{

		String s="liR Il";

		s=s.replace(" ","");

		s=s.toLowerCase();
		
		char x[]=s.toCharArray();
		int size=x.length;

		char a[]=new char[size];
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=x[i];
			i++;
		}
		int j=0;	
		while(j!=size)
		{
			if(a[j]!=x[j])
			{
				System.out.println("Not palindrom ");
				System.exit(0);
			}
			else
			{
				j++;
				continue;
			}
		}
		System.out.println("palindrom");


		System.out.println(x);
		System.out.println(a);
	}
}
