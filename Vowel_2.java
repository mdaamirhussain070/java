import java.util.*;
class Vowel_2
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
		int m=0,n=0,o=0;
		for(int i=0;i<str1.length();i++)
		{
			if(a[i]=='a' || a[i]=='A'|| a[i]=='i' || a[i]=='I' || a[i]=='e' || a[i]=='E' || a[i]=='0' || a[i]=='O' || a[i]=='u' || a[i]=='U' )
			{
				m++;

			}
			else if(((a[i]>65) && (a[i]<91)) || ((a[i]>97)&&(a[i]<123)))
			{
				n++;

			}
			
			else
			{
				o++;
			}
		
		}

		System.out.println("a or A  vowel="+m);
		System.out.println("Consonent = "+n);
		System.out.println("Special character= "+o);
		
			
	}
}
