package Abstraction;

//interface Program-4:
//if child class not implementing abstract methods present in interface class,
//then we have to declare this child class as abstract and 
//implement the abstract methods by creating one more child class

public interface IT4 
{
	public abstract void m1(int a,int b);

	abstract void m2(String s);

	abstract void m3(char c, double d);
}

abstract class run implements IT4  //2 N Methods  1 abstract Methods
{									//it is an abstract class, both normal & abstract methods are possible
	public void m1(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("Normal Method-1");
	}

	public void m2(String s)
	{
		System.out.println(s);
		System.out.println("Normal Method-2");
	}
}

class display extends run   //3N
	{

	public void m3(char c,double d)
	{
		System.out.println(c);
		System.out.println(d);
		System.out.println("Normal Method-3");
	}
		
	public static void main(String[] args) 
	{

	display c1=new display();
	        c1.m1(100,400);
	        c1.m2("Anil");
	        c1.m3('M',21.05);
	}
}
