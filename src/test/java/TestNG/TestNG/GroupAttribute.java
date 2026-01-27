package TestNG.TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.*;


public class GroupAttribute {
	@Test(groups="Software company")
	public void Infosys() {
		System.out.println("Infosys");
	}
	@Test(groups="Software company")
	public void Wipro() {
		System.out.println("Wipro");
	}
	@Test(groups="Software company")
	public void HCL() {
		System.out.println("HCL");
	}
	@Test(groups="Automobile")
	public void Maruti() {
		System.out.println("Maruti");
	}
	@Test(groups="Automobile")
	public void Hyundai() {
		System.out.println("Hyundai");
	}
	@Test(groups="Automobile")
	public void Toyota() {
		System.out.println("Toyota");
	}
	

}
