package LoopJava;

public class EncapsulationDemoMain {

	public static void main(String[] args) {
		EncapsulationDemo acc = new EncapsulationDemo();
		
		acc.setAccno(101);
		System.out.println(acc.getAccno());
		
		acc.setName("Rafie");
		System.out.println(acc.getName());
		
		acc.setAmount(10000);
		System.out.println(acc.getAmount());
	}

}
