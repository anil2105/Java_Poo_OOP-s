package Abstraction;

//interface Program-3:
//using abstract keyword (it's optional, but still we shall use)

public abstract interface IT3  //we are providing abstract keyword-->it is optional
{
	public abstract void m1(int a,int b); //we are providing public abstract-->it is optional

	abstract void m2(String s); //we are providing abstract keyword-->it is optional

	 void m3(char c, double d); //by default complier provides public abstract 
}

class Child30 implements IT3
{
	public void m1(int a,int b) //for abstract class, public keyword is mandatory
	{
		System.out.println(a+b);
		System.out.println("Normal Method-1");
	}

	public void m2(String s) //for abstract class, public keyword is mandatory
	{
		System.out.println(s);
		System.out.println("Normal Method-2");
	}

	public void m3(char c,double d) //for abstract class, public keyword is mandatory
	{
		System.out.println(c);
		System.out.println(d);
		System.out.println("Normal Method-3");
	}

	public static void main(String[] args) 
	{

	Child30 c1=new Child30();
	        c1.m1(100,400);
	        c1.m2("Anil");
	        c1.m3('M',21.05);
	}
}
