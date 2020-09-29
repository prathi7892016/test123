package com.pj.model1;

/*public class Greeter {
	public void Greet() {
		System.out.println("Hello Greeting");
	}

}*/
@FunctionalInterface
interface  Greeting{
	public void perform();

	  public class Greeter{ 
	  public void Greet(Greeting greeting) {
	  greeting.perform();
	  }
	  class HelloGreeting implements Greeting{
	  
	  @Override public void perform() { System.out.println("Hello Greeting");
	  
	  } } static class HiGreeting implements Greeting{
	  
	  @Override public void perform() { System.out.println("Hi Greeting"); } }
	 
			
	  }
}



