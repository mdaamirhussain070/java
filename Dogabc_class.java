class Dog
{
	String name;
	String color;
	int cost;
	String breed;


		void run()
		{
				System.out.println("Dog id running");
		}
		void eat()
		{
			System.out.println("Dog is eating");
		}
		void bark()
		{
			System.out.println("Dog is barking");
		}
		void sleep()
		{
			System.out.println("Dog is sleeping");
		}
}
class launchdog
{
		public static void main(String args[])
		{
			Dog d1=new Dog();
			d1.name="Tommy";
			d1.color="white";
			d1.cost=5000;
			d1.breed="BR";
			System.out.println(d1.name);
			System.out.println(d1.color);
			System.out.println(d1.cost);
			System.out.println(d1.breed);
	
			d1.run();
			d1.bark();
			d1.eat();
				d1.sleep();
		}
}
