package com.fufang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@RequestParam Integer a, @RequestParam Integer b) {
		Integer r = a * b;
		return r.toString();
	}

}
