package Polymorphism;

public class MethodOverLoading 
{
	//Method OverLoading

		void show()
		{
			System.out.println("Method OverLoading-1");
		}

		void show(String s)
		{
			System.out.println(s);
			System.out.println("Method OverLoading-2");
		}
		void show(int a,int b)
		{
			System.out.println(a+b);
			System.out.println("Method OverLoading-3");

		}


		public static void main (String [] args)
		{
			
		MethodOverLoading m1=new MethodOverLoading();
		
				m1.show();
				m1.show("Anil");
				m1.show(21, 05);

		}
	

}
