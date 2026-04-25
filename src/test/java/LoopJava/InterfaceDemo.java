package LoopJava;


interface Shape
{
	int length = 10;  //final & Static
	int width = 5;   // Final & Static
	
	void circle();   //Abstract Method
	
	default void Square()
	{
		System.out.println("this is Square   --default method");
	}
	static void rectangle()
	{
		System.out.println("This is Rectangle     --static method");
	}
	}

public class InterfaceDemo  implements Shape{
	
	public void circle()
	{
		System.out.println("This is Circle");
	}

	public static void main(String[] args) {
//		InterfaceDemo i = new  InterfaceDemo();
//		
//		i.circle(); // abstract
//		i.Square();  // default
//		
//		Shape.rectangle();  //static method can directly access from interface
		
         Shape sh = new  InterfaceDemo();
		
		sh.circle(); // abstract
		sh.Square();  // default
		
		Shape.rectangle();  //static method can directly access from interface
	}

}
