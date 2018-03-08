package spring.day0308;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService{
	
	@Value("안녕")
	private String greeting;
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public void sayHello(String name) throws Exception{
		System.out.println("sayHello : " + greeting + " :" + name);
		throw new Exception("예외발생");
	}
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye : " + greeting + " :" +name);
	}
	

}
