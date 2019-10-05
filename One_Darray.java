import java.util.*;
class One_Darray 
{
	public static void main(String[] args) 
	{
		int i,k=1;
		int a[]=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks of student");
		for(i=0;i<5;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Marks of studend is as follows:");
		for(i=0;i<5;i++)
		{
			System.out.println("Marks of Student "+k+"=:"+a[i]);
			k++;
		}
	//	System.out.println("Hello World!");
	}
}
