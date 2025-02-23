package com.springboot.restservices.SpringBootProject.Hello;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
	

//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
@GetMapping("/helloworld2")
public String helloWorld() {
	return "Hello World2";
}

@GetMapping("/helloworld-bean")
public UserDetails helloWorldBean() {
	return new UserDetails("Mithulan","Aadvik","Chennai");
}


}
