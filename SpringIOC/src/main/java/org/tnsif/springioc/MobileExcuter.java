package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//program to demonstrate on spring IOC

public class MobileExcuter {

	public static void main(String[] args) {
//		Airtel a=new Airtel();
//		a.call();
//		a.message();
//		
//		Jeo j=new Jeo();
//		j.call();
//		j.message();
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
//        Airtel a=(Airtel) c.getBean("airtel");
//        a.call();
//        a.message();
		
//		Jeo a=(Jeo) c.getBean("Jeo");
//         a.call();
//         a.message();
        
		
		   Sim s=c.getBean("sim",Sim.class);
		   s.call();
		   s.message();
		   
	}

}
