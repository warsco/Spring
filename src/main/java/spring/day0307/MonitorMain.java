package spring.day0307;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MonitorMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		context.registerShutdownHook();

	}

}
