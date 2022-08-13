package Encapsulation;

//Encapsulation-->Private members only (variable)

public class Encapsulation
{
	//Private variable (member)
	
	private int empID;
	
	private String empName;
	
	private double empSal;
	
	private boolean empMarSt;
	
	//Set method
	
    void setEmpID(int empID)
	{
		this.empID=empID; //this-->local & instance variable name are same
	}
	
	void setEmpName(String empname)
	{
		this.empName=empname; //this-->local & instance variable name are same
	}
	
	void setEmpSalary(double empSal)
	{
		this.empSal=empSal; //this-->local & instance variable name are same
	}
	
	void setEmpMarStatus(boolean MarSt)
	{
		this.empMarSt=MarSt;
	}
	
	//Get method
	
	int getEmpID()
	{
		return empID;
	}
	
	String getEmpName()
	{
		return empName;	
	}
	
	double getEmpSalary()
	{
		return empSal;
	}
	
	boolean getMarStatus()
	{
		return empMarSt;
		
	}
	
	public static void main(String[] args) 
	{
		Encapsulation e1=new Encapsulation();
		
			e1.setEmpID(1001); //return type-->void ; print statement is not possible
					
			int empID1 = e1.getEmpID(); //return type-->int
			System.out.println("Emp ID="+empID1);
	
		//.............................................................
			System.out.println();
					
			e1.setEmpName("Poo"); //return type-->void ; print statement is not possible
			
			String empName1 = e1.getEmpName(); //return type-->String
			System.out.println("Emp Name="+empName1);
			
		//..............................................................
			System.out.println();
			
			e1.setEmpSalary(99.99);
			
			double empSalary1 = e1.getEmpSalary(); //return type-->double
			System.out.println("Emp Salary="+empSalary1);
			
		//...............................................................
			System.out.println();
			
			e1.setEmpMarStatus(false);
			
			boolean marStatus1 = e1.getMarStatus(); ////return type-->boolean
			System.out.println("Emp Marriage Status="+marStatus1);	
					
	}
}
