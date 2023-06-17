package Abstraction;

//interface Program-6:
//interface to interface inheritance is possible
//by using extends keyword

public interface IT6 //3 methods
{
	void m1();

	void m2();

	void m3();
}

interface Eat extends IT6  //5 Methods //interface to interface-->extends keyword
{
	abstract void m4();

	abstract void m5();
}

class Talk implements Eat //5 methods //class to interface-->implements keyword
{
		
	public void m1()
	{
		System.out.println("Normal Method-1");
	}

	 public void m2()
	{
		System.out.println("Normal Method-2");
	}

	public void m3()
	{
		System.out.println("Normal Method-3");
	}
		
	public void m4()
	{
		System.out.println("Normal Method-4");
	}

	public void m5()
	{
		System.out.println("Normal Method-5");
	}

public static void main(String[] args) 
	{
		Talk c1=new Talk();
	    c1.m1();
	    c1.m2();
	    c1.m3();
	    c1.m4();
	    c1.m5();
	}
}
