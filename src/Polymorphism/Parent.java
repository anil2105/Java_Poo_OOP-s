package Polymorphism;

//OverRiding

public class Parent 
{
	void property()
	{
		System.out.println("2 land + 10Cr money + 10Kg Gold + Political power");
	}

	void marry()
	{
		System.out.println("Kongi");
	}

}

class Child extends Parent
{
	
	void marry() //OverRiding the parent class marry() method
	{
		System.out.println("Katrina Kaif");
	}
	
	public static void main(String [] args)
   
	{
		System.out.println("--------Parent class-------");
		Parent p1=new Parent();
			p1.property();
			p1.marry();

		System.out.println();
		
		System.out.println("--------Child class-------");
		Child c1=new Child();
			c1.property();
			c1.marry();

	}
	
	
}
