package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

	@GetMapping("/enter")
	 public String secweb() {
		return ("<h1>Welcome<h1>");
	}
}
