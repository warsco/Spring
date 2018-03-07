package spring.day0307;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	
	private Foo foo;
	
	@Required
	@Autowired
	@Qualifier("action")
	//@Resource
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	@Bean
	public Foo activeFoo() {
		System.out.println("실행?");
		Foo f =new Foo();
		f.setName("tiger");
		System.out.println(f.getName());
		return f;
	}
	
	public void doBar() {
		foo.doFoo();
	}
	
}