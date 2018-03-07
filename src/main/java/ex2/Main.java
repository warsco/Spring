package ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("exContext.xml");
		
		Cats myCat = ctx.getBean("myCat", Cats.class);
		
		myCat.getCatsInfo();

	}

}
