import java.util.*;
abstract class Shape
{
	float area;
	abstract void input();
	abstract void compute();
	void display()
	{
		System.out.println("Area of Shape is:"+area);
	}
}
class Rectangle extends Shape
{
	float length;
	float breath;
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		length=scan.nextFloat();
		System.out.println("Enter breath of Rectangle");
		breath=scan.nextFloat();
	}
	void compute()
	{
		area=length*breath;
	}

}
class Square extends Shape
{
	float side;
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Side of Square");
		side=scan.nextFloat();
	}
	void compute()
	{
		area=side*side;
	}

}
class Circle extends Shape
{
	float radius;
	float pi=3.14f;
	 void input()
	{
		 Scanner scan=new Scanner(System.in);

		 System.out.println("Enter Radius of the Circle:");
		radius=scan.nextFloat();
	}
	void compute()
	{
		area=pi*radius*radius;
	}
}
class Geomatry
{
	

	void permit(Shape c)
	{
		c.input();
		c.compute();
		c.display();
	}
}
class LaunchShape 
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c=new Circle();
		Geomatry g=new Geomatry();
		g.permit(r);
		g.permit(s);
		g.permit(c);

		System.out.println();
	}

}
