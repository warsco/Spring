package spring.day0307;

public class GreetingServiceImpl implements GreetingService{
	
	private String greeting;
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public void sayHello(String name) throws Exception{
		System.out.println("sayHello : " + greeting + ":" + name);
		throw new Exception("예외발생");
	}
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye : " + greeting + ":" +name);
	}
	

}
