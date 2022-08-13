package Abstraction;

//interface Program:7
//nested interface is possible 
//by using .
//IT7.IT200

public interface IT7 
{

	interface IT200  
	{
		abstract void add(); //abstract keyword is optional
		abstract void sub();
	}
		
}

class Child100 implements IT7.IT200 //nested interface //class to interface-->implements keyword
{
	public void add()
	{
		System.out.println("Add Method");
	}
	
	public void sub()
	{
		System.out.println("Sub Method");
	}

public static void main(String[] args)
		{
			Child100 c1=new Child100();
	          c1.add();
	          c1.sub();
		}
}
