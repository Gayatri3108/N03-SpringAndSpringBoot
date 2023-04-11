package org.tnsif.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
//A contr0ller contains the business logic of an application
//it is used to mark the class as a controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Code to demonstrate on simple web application ");
		return "home.jsp";
	}

}