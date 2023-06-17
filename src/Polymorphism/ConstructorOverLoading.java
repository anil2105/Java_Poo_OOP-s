package Polymorphism;

public class ConstructorOverLoading 
{
	//Constructor OverLoading
	
		ConstructorOverLoading()
		{
			System.out.println("Constructor OverLoading-1");
		}

		ConstructorOverLoading(int a,int b,int c)
		{
			System.out.println(a+b+c);
			System.out.println("Constructor OverLoading-2");
		}

		ConstructorOverLoading(boolean b, char c)
		{
			System.out.println(b);
			System.out.println(c);
			System.out.println("Constructor OverLoading-3");
		}


		public static void main (String [] args)
		{
				
			ConstructorOverLoading c1=new ConstructorOverLoading();
			
									  new ConstructorOverLoading(10,20,30); //also possible
									  
			ConstructorOverLoading c3=new ConstructorOverLoading(false, 'M');
		
		}
		
}
