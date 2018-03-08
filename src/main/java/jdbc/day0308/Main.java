package jdbc.day0308;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("jdbcEx.xml");
	
		jdbcDao dao = context.getBean("jdbcDao", jdbcDao.class);
		
		//dao.insert();
		
		List<User> mem = dao.selectAll();
		for(User user : mem) {
			System.out.println(user);
		}
		
		

	}

} 
