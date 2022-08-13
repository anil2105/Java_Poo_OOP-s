package Inheritance;

//How Many Methods
//Method Name
//Call The Method
//Answer

/*
  -----------------------------------------SINGLE INHERITANCE----------------------------------------
 public class Parent //1

{
	int moneyP=10000;

	void moneyParent()
	{
		System.out.println("Parent Class="+moneyP);
	}
}

class Child extends Parent //2
	{
	int moneyC=1000;

	void moneyChild()
	{
		System.out.println("Child Class="+moneyC);
	}
		
		
public static void main(String[] args)
	{
	System.out.println("-------------------Parent Class--------------------");
	Parent p1=new Parent(); 
	       p1.moneyParent();

	System.out.println();
	System.out.println("----------------------Child Class--------------------");
	Child c=new Child();
	      c.moneyParent();
	      c.moneyChild();
	}
	
}

*/

/*
 *  -----------------------------------------MULTI LEVEL INHERITANCE----------------------------------------
 
 
public class Parent //1
{

	int moneyP=10000;

	void moneyParent()
	{
		System.out.println("Parent Class="+moneyP);
	}
}

class Child extends Parent//2
{
	int moneyC=1000;

	void moneyChild()
	{
		System.out.println("Child Class="+moneyC);
	}
	
}

class Child1 extends Child//3
{
	int moneyC1=100;

	void moneyChild1()
	{
		System.out.println("Child1 Class="+moneyC1);
	}

}

class Child2 extends Child1//4
{
	int moneyC2=10;

	void moneyChild2()
	{
		System.out.println("Child2 Class="+moneyC2);
	}

public static void main(String[] args)
{
	System.out.println("-------------------Parent Class--------------------");
		Parent p1=new Parent();
			p1.moneyParent();

	System.out.println();
	System.out.println("----------------------Child Class--------------------");
		Child c=new Child();
			c.moneyParent();
			c.moneyChild();

	System.out.println();
	System.out.println("----------------------Child1 Class--------------------");
		Child1 c1=new Child1();
			c1.moneyParent();
			c1.moneyChild();
			c1.moneyChild1();

    System.out.println();
    System.out.println("----------------------Child2 Class--------------------");
    	Child2 c2=new Child2();
    		c2.moneyParent();
    		c2.moneyChild();
    		c2.moneyChild1();
    		c2.moneyChild2();
}

}
*/
/*
* -----------------------------------------HEIRARCHICAL INHERITANCE----------------------------------------
public class Parent//1
{
	int moneyP=10000;

	void moneyParent()
	{
		System.out.println("Parent Class="+moneyP);
	}
}

class Child extends Parent//2
{
	int moneyC=1000;

	void moneyChild()
	{
		System.out.println("Child Class="+moneyC);
	}
		
}

class Child1 extends Parent//2
{
	int moneyC1=100;

	void moneyChild1()
	{
		System.out.println("Child1 Class="+moneyC1);
	}

}

class Child2 extends Parent//2
	{
	int moneyC2=10;

	void moneyChild2()
	{
		System.out.println("Child2 Class="+moneyC2);
}

public static void main(String[] args)
	{
	System.out.println("-------------------Parent Class--------------------");
	Parent p1=new Parent();
	       p1.moneyParent();

	System.out.println();
	System.out.println("----------------------Child Class--------------------");
	Child c=new Child();
	      c.moneyParent();
	      c.moneyChild();

	System.out.println();
	System.out.println("----------------------Child1 Class--------------------");
	Child1 c1=new Child1();
	       c1.moneyParent();
	       c1.moneyChild1();

	System.out.println();
	System.out.println("----------------------Child2 Class--------------------");
	Child2 c2=new Child2();
	       c2.moneyParent();
	       c2.moneyChild2();
	}	
	
}
*/

// -----------------------------------------HYBRID INHERITANCE----------------------------------------
public class Parent//1
{
	int moneyP=10000;

	void moneyParent()
	{
		System.out.println("Parent Class="+moneyP);
	}
}

class Child extends Parent//2
{
	int moneyC=1000;

	void moneyChild()
	{
		System.out.println("Child Class="+moneyC);
	}
		
}

class Child1 extends Parent//2	//HEIRARCHICAL INHERITANCE
{
	int moneyC1=100;

	void moneyChild1()
	{
		System.out.println("Child1 Class="+moneyC1);
	}

}

class Child2 extends Child1//3
{
	int moneyC2=10;

	void moneyChild2()
	{
		System.out.println("Child2 Class="+moneyC2);
	}
}

class Child3 extends Child2//4	//MULTI LEVEL INHERITANCE
{
	int moneyC3=1;

	void moneyChild3()
	{
		System.out.println("Child3 Class="+moneyC3);
}
	
public static void main(String[] args)
	{
	System.out.println("-------------------Parent Class--------------------");
	Parent p1=new Parent();
	       p1.moneyParent();

	System.out.println();
	System.out.println("----------------------Child Class--------------------");
	Child c=new Child();
	      c.moneyParent();
	      c.moneyChild();

	System.out.println();
	System.out.println("----------------------Child1 Class--------------------");
	Child1 c1=new Child1();
	       c1.moneyParent();
	       c1.moneyChild1();

	System.out.println();
	System.out.println("----------------------Child2 Class--------------------");
	Child2 c2=new Child2();
	       c2.moneyParent();
	       c2.moneyChild1();
	       c2.moneyChild2();
	       
	System.out.println();
	System.out.println("----------------------Child3 Class--------------------");
	 Child3 c3=new Child3();      
	         c3.moneyParent();
	         c3.moneyChild1();
	         c3.moneyChild2();
	         c3.moneyChild3();
	}	
	
}
