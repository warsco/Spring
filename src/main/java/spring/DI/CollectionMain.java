package spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionMain {
	
	public static void main(String[] arg) {

		//컨테이너 생성(applicationContext.xml)
		String configLocation = "applicationContext.xml";
		ApplicationContext context = new GenericXmlApplicationContext(configLocation);

		/*Foo foo = context.getBean("fooLookup", Foo.class);
		foo.lookupBaz();*/

		CollectionDi cd = context.getBean("collections", CollectionDi.class);
		
		System.out.println(cd.getMap().toString());
		System.out.println(cd.getValueList().toString());
		System.out.println(cd.getPro().toString());
		
		
	}


}
