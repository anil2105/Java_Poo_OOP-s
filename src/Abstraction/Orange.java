package Abstraction;

public abstract class Orange //4 Methods: 2 abstract methods & 2 normal methods --> Instance methods
{
	void run()
	{
		System.out.println("Normal Method-1");
	}

	void display()
	{
		System.out.println("Normal Method-2");
	}

	abstract void color();

	abstract void bike();

}

class Anil extends Orange //4 Methods: 0 abstract methods & 4 normal methods --> Instance methods
{

	void color()
	{
		System.out.println("Normal Method-3");
	}

	
	void bike()
	{
		System.out.println("Normal Method-4");
	}

	
	public static void main(String[] args) 
	{
		Anil a1=new Anil();
         a1.run();
         a1.display();
         a1.color();
         a1.bike();
	}	

}
