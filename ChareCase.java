import java.util.*;
class  ChareCase
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

		str=str.toUppercase(0);
		for(int j=0;j<a.length;j++)
			System.out.println(a[j]);
	}
}
