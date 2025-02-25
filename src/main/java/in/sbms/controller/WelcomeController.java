package in.sbms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome To CloudBytes with Suraj";
	}
	
	@GetMapping("/contact")
	public String contactDetails() {
		return "5266872626";
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "Good Morning";
	}
}
