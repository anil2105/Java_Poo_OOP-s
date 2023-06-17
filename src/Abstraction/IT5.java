package Abstraction;

//interface Program-5:
//multiple inheritance is possible in interface

public interface IT5 
{
	void m1();  //by default public abstract is present-->complier provides

	void m2();

	void m3();
}

interface Apple    //2 Methods
{
	abstract void m4(); //abstract keyword is optional

	abstract void m5(); 
	
}

class Mango implements IT5,Apple //multiple inheritance is possible in interface
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

	Mango c1=new Mango();
	     c1.m1();
	     c1.m2();
	     c1.m3();
	     c1.m4();
	     c1.m5();
	}
}

