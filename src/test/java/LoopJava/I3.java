package LoopJava;

//multiple Inheritance
public class I3 extends I4 implements I1,I2 {
	
	public void m1()
	{
		System.out.println("this is M1 method");
		System.out.println(x);

	}
	public void m2()
	{
		System.out.println("this is M2 method");
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I3 i = new I3();
		i.m1();
		i.m2();
		i.m3();

	}

}
