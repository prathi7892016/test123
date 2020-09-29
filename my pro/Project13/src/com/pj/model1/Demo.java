package com.pj.model1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Factory Design Pattern we can get rid of line no.8 below
		
		Greeter greeter=new Greeter();
		greeter.Greet(new Greeting() {
			public void perform() {
				System.out.println("Hello World");
			}
		});
		greeter.Greet(new Greeting() {
			public void perform() {
				System.out.println("Hi World");
			}
			});
		greeter.Greet(new Greeting() {
			public void perform() {
				System.out.println("Welcome World");
			}
		});
	}
}
	


