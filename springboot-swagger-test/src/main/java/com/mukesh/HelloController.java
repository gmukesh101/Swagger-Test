package com.mukesh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mukesh
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/springboot")
	public String sayHello() {
		return "Swagger Hello World";
	}
}
