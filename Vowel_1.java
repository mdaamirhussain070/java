import java.util.*;
class Vowel_1 
{
	public static void main(String[] args) 
	{
		String str;
		char a[];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String ");
		str=scan.nextLine();
		System.out.println(str);

	
	    String str1 = str.replaceAll("\\s", "");
		System.out.println(str);

		a=str1.toCharArray();

		System.out.println(a);
		int count=0,m=0,n=0,o=0,p=0,q=0;
		for(int i=0;i<str1.length();i++)
		{
			if(a[i]=='a' || a[i]=='A' )
			{
				m++;

			}
			else if(a[i]=='i' || a[i]=='I')
			{
				n++;

			}
			
			else if(a[i]=='e' || a[i]=='E')
			{
				o++;
			}
			else if(a[i]=='0' || a[i]=='O')
			{
				p++;
			}
			else if(a[i]=='u' || a[i]=='U')
			{
				q++;
			}

		}

		System.out.println("a or A  vowel="+m);
		System.out.println("i or I  vowel="+n);
		System.out.println("e or E  vowel="+o);
		System.out.println("o or O  vowel="+p);
		System.out.println("u or U  vowel="+q);

			if (count==0)
			{
				System.out.println("No vowels in the String");
			}
		System.out.println();
		count=m+n+o+p+q;
		System.out.println("Total number of vowel"+count);
	}
}
