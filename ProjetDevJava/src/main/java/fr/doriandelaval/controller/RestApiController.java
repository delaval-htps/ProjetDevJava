package fr.doriandelaval.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class RestApiController {

	@GetMapping("/hello")
	public String testRest() {
		return("hello World!");
	}
}
