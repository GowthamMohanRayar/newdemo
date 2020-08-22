package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String printHello() {
		return "hello";
	}

	@GetMapping("/say")
	public String sayHello() {
		return "hello";
	}

	@GetMapping("/says")
	public String saysHello() {
		return "saysHello";
	}

	@GetMapping("/malamalamalemale")
	public String malamalamalemale() {
		return "malamalamalemale";
	}

	@PostMapping("/getById")
	public Bean getById(@RequestBody(required=true) Bean id) {
		System.out.println(id.getId());
		System.out.println(id.getName());
		Bean bean = new Bean();
		bean.setId("1");
		bean.setName("Gowtham");
		return bean;
	}

}
