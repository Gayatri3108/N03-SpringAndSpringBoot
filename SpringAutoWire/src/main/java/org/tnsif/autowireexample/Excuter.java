package org.tnsif.autowireexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Excuter  {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Actors a=c.getBean("actor",Actors.class);
		a.accept();
	}

}