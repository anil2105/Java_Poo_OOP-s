package Abstraction;

//interface Program-2:
//with parameter

public interface IT2 
{
	void m1(int a,int b);

	void m2(String s);

	void m3(char c, double d);
}

class Child20 implements IT2
{
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

	public void m3(char c,double d)
	{
		System.out.println(c);
		System.out.println(d);
		System.out.println("Normal Method-3");
	}

public static void main(String[] args) 
	{

	Child20 c1=new Child20();
	        c1.m1(100,400);
	        c1.m2("Anil");
	        c1.m3('M',21.05);
	}
}
