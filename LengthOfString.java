class LengthOfString 
{
	public static void main(String[] args) 
	{


		String x ="Gmail .com";
		x=x.concat("\0");
		char s[]=x.toCharArray();

		int i=0,count=0;


		while(s[i]!='\0')
		{
			count++;
			i++;
		}


		System.out.println("length of string  " +count);
	}
}
