package spring.day0307;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopTest.xml");
		GreetingService bean = ctx.getBean("greetingTarget", GreetingService.class);

		try {
			bean.sayHello("java");
		}catch (Exception e) {}
		bean.sayGoodbye("spring");
	}

}
