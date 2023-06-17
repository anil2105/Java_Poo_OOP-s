package Abstraction;

//interface Program:1
//without parameter

public interface IT1
{
	void m1();

	void m2();

	void m3();
}

class Child10 implements IT1
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

public static void main(String[] args) 
{
	Child10 c1=new Child10();
        c1.m1();
        c1.m2();
        c1.m3();
}

}