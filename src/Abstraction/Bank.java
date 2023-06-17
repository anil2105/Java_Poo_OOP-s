package Abstraction;

public abstract class Bank  //3 Methods: 1 n  2 ab
{
	void welcome()
	{
		System.out.println("Welcome To Online Banking..");
	}

	abstract void personalLoan(int interest);

	abstract void homeLoan(int interest);
	
}

class HDFC extends Bank     //3 Methods: 3 n
{
	void personalLoan(int interest)
	{
		System.out.println("HDFC Bank Personal Loan Interest="+interest);
	}
	
	void homeLoan(int interest)
	{
		System.out.println("HDFC Bank Home Loan Interest="+interest);
	}

}

class ICICI extends Bank	//3 Methods: 3 n
{
	void personalLoan(int interest)
	{
		System.out.println("ICICI Bank Personal Loan Interest="+interest);
	}
		
	void homeLoan(int interest)
	{
		System.out.println("ICICI Bank Home Loan Interest="+interest);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("-------------------HDFC Bank----------------");
			HDFC h1=new HDFC();	
				h1.welcome();
				h1.personalLoan(12);
				h1.homeLoan(8);
      
		System.out.println();
		System.out.println("---------------------ICICI Bank---------------");
			ICICI i1=new ICICI();
            	i1.welcome();
            	i1.personalLoan(13);
            	i1.homeLoan(6);  
	}	
	
}