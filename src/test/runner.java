package test;

import main.funcionality;

public class runner {
	
	public static funcionality runner=new funcionality();//runner object reference variable, new functionality() object
	static runner run=new runner();
	
	public static void main(String[] args) {
		//runner run=new runner();
		int add=runner.addition(10, 15);
		System.out.println("The result is: "+add);
		runner.addition();
		run.helloWorld();
		int a=10;
		int b=50;
		int addition=a+b;
		

	}
	
	public void helloWorld() { //if static keyword is not present in the code then need to create object to handle the variable
		System.out.println("Hello world");
	}
	
	

}
