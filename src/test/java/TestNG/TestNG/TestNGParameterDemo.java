package TestNG.TestNG;
import org.testng.annotations.*;


public class TestNGParameterDemo {
	@Parameters({"i","j"})
	@Test
	public void add(int a, int b ) {
		System.out.println(a+b);
	}
	@Parameters({"i","j"})
	@Test
	public void Subtract(int a, int b ) {
		System.out.println( a-b);
	}
	@Parameters({"i","j"})
	@Test
	public void Multiply(int a, int b ) {
		System.out.println("Multiplication " + a*b);
	}

}
