package Polymorphism;

public class MainMethodOverLoading 
{
	//MainMethod OverLoading

	public static void main ()
	{
		System.out.println("Main Method OverLoading-1");
	}

	public static void main(char c)
	{
		System.out.println(c);
		System.out.println("Main Method OverLoading-2");
	}

	public static void main(double d, boolean b)
	{
		System.out.println(d);
		System.out.println(b);
		System.out.println("Main Method OverLoading-3");
	}


	public static void main(String [] args)
	{
		
		MainMethodOverLoading.main();
		MainMethodOverLoading.main('M');
		MainMethodOverLoading.main(21.05,true);
	
	}
	
	
}
