package Abstraction;

public abstract class Demo //3 Methods: 1 n  2 ab
{
	void college(String cName)
	{
		System.out.println(cName);
		System.out.println("Normal Method-1");
	}

	abstract void student(String sName);

	abstract void teacher(String className);
	
}

abstract class Demo1  extends Demo //3 Methods: 2 n  1 ab
{
	void student(String sName)
	{
		System.out.println(sName);
		System.out.println("Normal Method-2");
	}

}

class Demo2 extends Demo1//3 Methods: 3 n  0 ab
{
	void teacher(String className)
	{
		System.out.println(className);
		System.out.println("Normal Method-3");
	}
	
	public static void main(String[] args)
	{
	
		Demo2 d1=new Demo2();
			d1.college("RV College");
			d1.student("Dinga");
			d1.teacher("FT");
			
	}
	
}