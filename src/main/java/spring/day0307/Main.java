package spring.day0307;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context
		=new GenericXmlApplicationContext("annoTest.xml");
		Bar bar = context.getBean("bar", Bar.class);
		bar.doBar();
		System.out.println("메인 doBar() 실행!");
		Foo foo = context.getBean("activeFoo", Foo.class);
		System.out.println(foo.getName());
		context.registerShutdownHook();
	}

}
