package spring.DI;

import org.springframework.beans.factory.annotation.Required;

public class Foo {
	
	String str; //str에 'hello' 저장
	int i; //i에 10 저장
	Bar bar;
	Baz baz;
	
	public Foo() {}
	
	
	//lookup메서드 선언
	public Baz getBaz() {
		return null;
	}
	
	//lookup메서드 호출
	public void lookupBaz() {
		baz=getBaz();
		baz.doBaz();
	}
	
	@Required
	public void setStr(String str) {
		this.str = str;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}

	public void printFoo() {
		bar.doBar();
	}
	
	public void printFoo2() {
		System.out.println("str : " + str +"  //  "+ "i : " + i );		
	}
	
	public Foo(String str, int i) {
		this.str = str;
		this.i = i;
	}
	
	public Foo(String str, String i) {}
	public Foo(int i, int j) {}
	
	
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}

}
