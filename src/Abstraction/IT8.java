package Abstraction;

//interface Program:8
//nested interface
//by using .
//IT8.IT200.IT300

public interface IT8 
{
	interface IT200
	{
		interface IT300
		{
			abstract void add();
			abstract void sub();
		}	
	}
		
}

class show implements IT8.IT200.IT300 //nested interface //class to interface-->implements keyword
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
			show c1=new show();
	          c1.add();
	          c1.sub();
		}
}
