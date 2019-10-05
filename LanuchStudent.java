class Brain
{
	float weight;
	int iq;

	Brain(float weight,int iq)
	{
		this.weight=weight;
		this.iq=iq;
	}
	float getWeight()
	{
		return weight;
	}
	int getIq()
	{
		return iq;
	}
}
class Heart
{
	float weight;
	int beat;

	Heart(float weight,int beat)
	{
		this.weight=weight;
		this.beat=beat;
	}

	float getWeight()
	{
		return weight;
	}
	int getBeat()
	{
		return beat;
	}

}
class Book
{
	String auther;
	int cost;

	Book(String auther,int cost)
	{
		this.auther=auther;
		this.cost=cost;
	}

	String getAuther()
	{
		return auther;
	}
	int getCost()
	{
		return cost;
	}
}

class Bike
{
	String name;
	int cost;

	Bike(String name,int cost)
	{
		this.name=name;
		this.cost=cost;
	}

	String getName()
	{
		return name;
	}
	int getCost()
	{
		return cost;
	}
}
class Human
{
		void usingBook(Book b)
	{
		System.out.println(b.getAuther());
		System.out.println(b.getCost());
	}

	void usingBike(Bike bk)
	{
		System.out.println(bk.getName());
		System.out.println(bk.getCost());
	}

}
class Student extends Human
{
	Brain br=new Brain(2.5f,6);
	Heart h=new Heart(2.6f,6);




}

class LanuchStudent
{
	public static void main(String[] args) 
	{

		Student s=new Student(); 
		Book b=new Book("Novel",200);
		Bike bk=new Bike("Royal Enfield",175000);

		System.out.println(s.br.getWeight());
		System.out.println(s.br.getIq());

		System.out.println(s.h.getWeight());

		System.out.println(s.h.getBeat());

		
		System.out.println(s.h.getBeat());
		s=null;
		s.usingBook(b);
		s.usingBike(bk);
		
		System.out.println(b.getAuther());
		System.out.println(b.getCost());

		System.out.println(bk.getName());
		System.out.println(bk.getCost());
		

	}
}
