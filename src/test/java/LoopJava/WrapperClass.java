package LoopJava;

public class WrapperClass {

	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "20";
		
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		String s3 = "10.5";
		String s4 = "20.7";
		
		System.out.println(Double.parseDouble(s3)+ Double.parseDouble(s4));
		
		
		String s5 = "True";
		System.out.println(Boolean.parseBoolean(s5));
		
		
		int a = 10;
		double b = 10.5;
		char c = 'A';
		boolean d = true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));

	}

}
