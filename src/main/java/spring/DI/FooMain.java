package spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FooMain {
	
	public static void main(String[] arg) {
		
		//컨테이너 생성(applicationContext.xml)
		String configLocation = "applicationContext.xml";
		ApplicationContext context = new GenericXmlApplicationContext(configLocation);
		
		Foo foo = context.getBean("fooLookup", Foo.class);
		foo.lookupBaz();
		
	}

}
