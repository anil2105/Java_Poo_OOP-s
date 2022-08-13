package Polymorphism;

//OverRiding

public class Parent1 //Home Loan
{
	void property()
	{
		System.out.println("2 land + 10Cr money + 10Kg Gold + Political power");
	}

	void marry()
	{
		System.out.println("Kongi");
	}
	
	void loan(int emi)
	{
		System.out.println(emi);
		System.out.println("Welcome to Home loan, Home loan max EMI's are available is:"+emi);
	}

}

class Child1 extends Parent1 //Personal Loan
{
	/*void property()
	{
		System.out.println("10 Cr");
	}*/
	
	void marry() //OverRiding the parent1 class void marry() method
	{
		System.out.println("Katrina Kaif");
	}
	
	void loan(int emi) //OverRiding the parent1 class void loan (int emi) method
	{
		System.out.println(emi);
		System.out.println("Welcome to Personal loan, Personal loan max EMI's are available is:"+emi);
	}
	
	public static void main(String [] args)
   
	{
		System.out.println("--------Parent1 class-------");
		Parent1 p1=new Parent1();
			p1.property();
			p1.marry();
			p1.loan(200);

		System.out.println();
		
		System.out.println("--------Child1 class-------");
		Child1 c1=new Child1();
			c1.property();
			c1.marry();
			c1.loan(100);

	}
	
}
